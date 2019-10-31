package com.jlol.constant;

import org.json.JSONArray;
import org.json.JSONObject;

public class Seasons {
	static JSONArray staticData;
	public static final int PRESEASON_2013 = 0;
	public static final int SEASON_2013 = 1;
	public static final int PRESEASON_2014 = 2;
	public static final int SEASON_2014 = 3;
	public static final int PRESEASON_2015 = 4;
	public static final int SEASON_2015 = 5;
	public static final int PRESEASON_2016 = 6;
	public static final int SEASON_2016 = 7;
	public static final int PRESEASON_2017 = 8;
	public static final int SEASON_2017 = 9;
	public static final int PRESEASON_2018 = 10;
	public static final int SEASON_2018 = 11;
	public static final int PRESEASON_2019 = 12;
	public static final int SEASON_2019 = 13;
	public static final int PRESEASON_2020 = 14;
	public static final int SEASON_2020 = 15;
	
	
	public static String toString(int Seasons) {
		String idKey = "id";
		
		for (int i = 0; i < staticData.length(); i++) {
			JSONObject data = new JSONObject(staticData.get(i).toString());
			if(data.getInt(idKey)==Seasons) {
				return data.getString("season");
			}
		}
		return "Unknown";
	}
}
