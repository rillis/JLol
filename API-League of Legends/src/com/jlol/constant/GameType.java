package com.jlol.constant;

import org.json.JSONArray;

public class GameType {
	static JSONArray staticData;
	public static final String CUSTOM_GAME = "CUSTOM_GAME";
	public static final String TUTORIAL_GAME = "TUTORIAL_GAME";
	public static final String MATCHED_GAME = "MATCHED_GAME";
	
	public static String toString(String GameType) {
		if(GameType.equals("CUSTOM_GAME")) {
			return "Custom game";
		}else if(GameType.equals("TUTORIAL_GAME")) {
			return "Tutorial game";
		}else if(GameType.equals("MATCHED_GAME")) {
			return "Matched game";
		}else {
			return "Unknown";
		}
	}
}
