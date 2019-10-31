package com.jlol.constant;

import org.json.JSONArray;
import org.json.JSONObject;

public class Maps {
	static JSONArray staticData;
	public static final int SR_SUMMER = 1;
	public static final int SR_AUTUMN = 2;
	public static final int TUTORIAL = 3;
	public static final int TT_ORIGINAL = 4;
	public static final int CRYSTALSCAR_DOMINION = 8;
	public static final int TT_LAST = 10;
	public static final int SR_CURRENT = 11;
	public static final int HA_ARAM = 12;
	public static final int BB_ARAM = 14;
	public static final int CR_DARKSTAR = 16;
	public static final int VALORAN_STARGUARDIAN = 18;
	public static final int PROJECT = 19;
	public static final int ODYSSEY = 20;
	public static final int NEXUS_BLITZ = 21;
	
	public static String toString(int Maps) {
		String idKey = "mapId";
		
		for (int i = 0; i < staticData.length(); i++) {
			JSONObject data = new JSONObject(staticData.get(i).toString());
			if(data.getInt(idKey)==Maps) {
				return data.getString("mapName")+" ("+data.getString("notes")+")";
			}
		}
		return "Unknown";
	}
}
