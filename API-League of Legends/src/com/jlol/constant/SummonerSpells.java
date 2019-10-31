package com.jlol.constant;

import org.json.JSONArray;
import org.json.JSONObject;

public class SummonerSpells {
	static JSONArray staticData;
	public static int BARRIER = 21; //Barrier
	public static int PORO_RECALL = 30; //To the King!
	public static int SNOW_URF_SNOWBALL_MARK = 39; //Ultra (Rapidly Flung) Mark
	public static int CLEANSE = 1; //Cleanse
	public static int TELEPORT = 12; //Teleport
	public static int FLASH = 4; //Flash
	public static int SNOWBALL_MARK = 32; //Mark
	public static int HEAL = 7; //Heal
	public static int CLARITY = 13; //Clarity
	public static int ODYSSEY_FLASH = 52; //Warp
	public static int PORO_THROW = 31; //Poro Toss
	public static int SMITE = 11; //Smite
	public static int EXHAUST = 3; //Exhaust
	public static int ODYSSEY_REVIVE = 50; //Resuscitate
	public static int IGNITE = 14; //Ignite
	public static int GHOST = 6; //Ghost
	
	public static String getDisplayName(int SummonerSpell) {
		String idKey = "key";
		
		for (int i = 0; i < staticData.length(); i++) {
			JSONObject data = new JSONObject(staticData.get(i).toString());
			if(Integer.parseInt(data.getString(idKey))==SummonerSpell) {
				return data.getString("name");
			}
		}
		return "Unknown";
	}
	
	public static String getInternalName(int SummonerSpell) {
		String idKey = "key";
		
		for (int i = 0; i < staticData.length(); i++) {
			JSONObject data = new JSONObject(staticData.get(i).toString());
			if(Integer.parseInt(data.getString(idKey))==SummonerSpell) {
				return data.getString("id");
			}
		}
		return "Unknown";
	}
}
