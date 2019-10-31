package com.jlol.constant;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jlol.LolAPI;
import com.jlol.Methods;

public class StaticData {

	public static void setupStaticData(LolAPI lolAPI) {
		QueueType.staticData = getStaticData("http://static.developer.riotgames.com/docs/lol/queues.json");
		Seasons.staticData = getStaticData("http://static.developer.riotgames.com/docs/lol/seasons.json");
		GameMode.staticData = getStaticData("http://static.developer.riotgames.com/docs/lol/gameModes.json");
		Maps.staticData = getStaticData("http://static.developer.riotgames.com/docs/lol/maps.json");
		SummonerSpells.staticData = getStaticDataConverted("http://ddragon.leagueoflegends.com/cdn/"+lolAPI.getLastVersion()+"/data/"+lolAPI.getLocale()+"/summoner.json");	
	}
	
	private static JSONArray getStaticDataConverted(String url) {
		try {
			
			JSONObject obj = new JSONObject(Methods.getWebsiteContent(url));
			obj = obj.getJSONObject("data");
			
			
			Iterator<String> keys = obj.keys();
			String temp = "[";
			int c = 1;
			while(keys.hasNext()) {
			    String key = keys.next();
			    JSONObject str = obj.getJSONObject(key);
			    if(c>1) {
			    	temp+=","+str.toString();
			    }else {
			    	temp+=str.toString();
			    }
			    c++;
			}
			temp += "]";
			JSONArray arr = new JSONArray(temp);
			return arr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private static JSONArray getStaticData(String url) {
		try {
			return new JSONArray(Methods.getWebsiteContent(url));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
