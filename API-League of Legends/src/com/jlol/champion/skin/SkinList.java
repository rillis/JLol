package com.jlol.champion.skin;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jlol.LolAPI;
import com.jlol.Methods;
import com.jlol.champion.Champion;

public class SkinList {
	String token;
	public SkinList(LolAPI api) {
		this.token = api.getToken();
	}
	
	public Skin[] getSkinListFromChampion(Champion c, String version, String locale) {
		
		try {
			String response = Methods.getWebsiteContent("http://ddragon.leagueoflegends.com/cdn/"+version+"/data/"+locale+"/champion/"+c.id+".json");
			
			JSONObject path = new JSONObject(response);
			path = path.getJSONObject("data");
			path = path.getJSONObject(c.id);
			JSONArray skinsArr = path.getJSONArray("skins");
			
			Skin[] skins = new Skin[skinsArr.length()];
			
			for (int i = 0; i < skinsArr.length(); i++) {
				JSONObject jsSkin = skinsArr.getJSONObject(i);
				Skin skin = new Skin(jsSkin.getString("id"),jsSkin.getInt("num"),jsSkin.getString("name"),jsSkin.getBoolean("chromas"));
				skins[i] = skin;
			}
			
			return skins;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
}
