package com.jlol.constant;

import org.json.JSONArray;

import com.jlol.LolAPI;
import com.jlol.Methods;

public class StaticData {

	public static void setupStaticData(LolAPI lolAPI) {
		QueueType.staticData = getStaticData("http://static.developer.riotgames.com/docs/lol/queues.json");
		Seasons.staticData = getStaticData("http://static.developer.riotgames.com/docs/lol/seasons.json");
		GameMode.staticData = getStaticData("http://static.developer.riotgames.com/docs/lol/gameModes.json");
		Maps.staticData = getStaticData("http://static.developer.riotgames.com/docs/lol/maps.json");
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
