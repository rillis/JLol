package com.jlol.constant;

import org.json.JSONArray;
import org.json.JSONObject;

public class GameMode {
	static JSONArray staticData;
	public static final String CLASSIC = "CLASSIC";
	public static final String DOMINION = "ODIN";
	public static final String ARAM = "ARAM";
	public static final String TUTORIAL = "TUTORIAL";
	public static final String URF = "URF";
	public static final String DOOMBOT = "DOOMBOTSTEEMO";
	public static final String ONEFORALL = "ONEFORALL";
	public static final String ASCENSION = "ASCENSION";
	public static final String SNOWDOWN = "FIRSTBLOOD";
	public static final String KINGPORO = "KINGPORO";
	public static final String NEXUSSIEGE = "SIEGE";
	public static final String BLOODHUNT = "ASSASSINATE";
	public static final String ALLRANDOM = "ARSR";
	public static final String DARKSTAR = "DARKSTAR";
	public static final String STARGUARDIAN = "STARGUARDIAN";
	public static final String PROJECT = "PROJECT";
	public static final String NEXUSBLITZ = "GAMEMODEX";
	public static final String ODYSSEY = "ODYSSEY";
	
	
	public static String toString(String GameMode) {
		String idKey = "gameMode";
		
		for (int i = 0; i < staticData.length(); i++) {
			JSONObject data = new JSONObject(staticData.get(i).toString());
			if(data.getString(idKey).equals(GameMode)) {
				return data.getString("description").replace(" games", "");
			}
		}
		return "Unknown";
	}
	
}
