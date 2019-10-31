package com.jlol;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.json.JSONArray;

import com.jlol.constant.StaticData;
import com.jlol.exception.ChampionNotFound;
import com.jlol.exception.InvalidToken;
import com.jlol.exception.StatementFailed;

public class LolAPI {
	private String token;
	private String region;
	public LolAPI(String token, String region) throws InvalidToken {
		this.token = token;
		this.region = region;
		
		if(!checkToken(token)) {
			throw new InvalidToken("Invalid Token: "+token+".");
		}
		
		StaticData.setupStaticData(this);
	}
	public String getToken() {
		return token;
	}
	
	public String getRegion() {
		return region;
	}
	
	public String getLastVersion() {
		try {
			String response = Methods.getWebsiteContent("https://ddragon.leagueoflegends.com/api/versions.json");
			JSONArray arr = new JSONArray(response);
			
			return arr.getString(0);
		}catch(IOException e) {
			return null;
		}
	}
	
	private boolean checkToken(String token) {
		try {
			Methods.getWebsiteContent("https://"+region+".api.riotgames.com/lol/platform/v3/champion-rotations?api_key="+token);
			return true;
		}catch(IOException e) {
			return false;
		}
	}
	
	public String runStatement(String path) throws StatementFailed {
		try {
			String response = Methods.getWebsiteContent("https://"+region+".api.riotgames.com"+path+"?api_key="+token);
			return response;
		}catch(IOException e) {
			e.printStackTrace();
			throw new StatementFailed("Error.");
		}
	}
	
	public String runStatement(String path, boolean composed) throws StatementFailed {
		try {
			String response = Methods.getWebsiteContent("https://"+region+".api.riotgames.com"+path+"&api_key="+token);
			return response;
		}catch(IOException e) {
			e.printStackTrace();
			throw new StatementFailed("Error.");
		}
	}
}
