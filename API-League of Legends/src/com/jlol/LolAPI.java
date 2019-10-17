package com.jlol;

import java.io.IOException;

import org.json.JSONArray;

import com.jlol.exception.InvalidToken;

public class LolAPI {
	private String token;
	public LolAPI(String token) throws InvalidToken {
		this.token = token;
		
		if(!checkToken(token)) {
			throw new InvalidToken("Invalid Token: "+token+".");
		}
	}
	public String getToken() {
		return token;
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
			Methods.getWebsiteContent("https://br1.api.riotgames.com/lol/platform/v3/champion-rotations?api_key="+token);
			return true;
		}catch(IOException e) {
			return false;
		}
	}
}
