package com.jlol.constant;

import org.json.JSONArray;
import org.json.JSONObject;

public class QueueType {
	static JSONArray staticData;
	public static final int CUSTOM = 0;
	public static final int SR_NORMAL_DRAFT = 400;
	public static final int SR_RANKED_SOLODUO = 420;
	public static final int SR_NORMAL_BLIND = 430;
	public static final int SR_RANKED_FLEX = 440;
	public static final int HA_ARAM = 450;
	public static final int TT_BLIND = 460;
	public static final int TT_RANKED = 470;
	public static final int CLASH = 700;
	public static final int SR_COOP_IA_INTRO = 830;
	public static final int SR_COOP_IA_BEGINNER = 840;
	public static final int SR_COOP_IA_INTERMEDIATE = 850;
	public static final int URF = 900;
	public static final int TFT_NORMAL = 1090;
	public static final int TFT_RANKED = 1100;
	
	public static String toString(int QueueType) {
		String idKey = "queueId";
		
		for (int i = 0; i < staticData.length(); i++) {
			JSONObject data = new JSONObject(staticData.get(i).toString());
			if(data.getInt(idKey)==QueueType) {
				
				String prefix = "";
				
				if(data.getString("map").equals("Custom games")) {
					prefix = "Custom Game";
				}else if(data.getString("map").equals("Summoner's Rift")) {
					prefix = "SR ";
				}else if(data.getString("map").equals("Twisted Treeline")) {
					prefix = "TT ";
				}else if(data.getString("map").equals("Howling Abyss")) {
					prefix = "HA ";
				}
				
				if(data.isNull("description")) {
					return prefix;
				}
				return prefix + data.getString("description").replace(" games", "");
			}
		}
		return "Unknown";
	}
}
