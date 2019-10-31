package com.jlol.constant;

import org.json.JSONObject;

public class QueueType {
	static JSONObject staticData;
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
		switch(QueueType) {
		case CUSTOM:
			return "Custom game";
		case SR_NORMAL_DRAFT:
			return "SR 5v5 Draft Pick";	
		case SR_RANKED_SOLODUO:
			return "SR 5v5 Ranked Solo/Duo";	
		case SR_NORMAL_BLIND:
			return "SR 5v5 Blind Pick";	
		case SR_RANKED_FLEX:
			return "SR 5v5 Ranked Flex";	
		case HA_ARAM:
			return "HA 5v5 ARAM";
		case TT_BLIND:
			return "TT 3v3 Blind Pick";
		case TT_RANKED:
			return "TT 3v3 Ranked Flex";
		case CLASH:
			return "SR 5v5 Clash";
		case SR_COOP_IA_INTRO:
			return "SR 5v5 Co-op vs. AI Intro Bot";
		case SR_COOP_IA_BEGINNER:
			return "SR 5v5 Co-op vs. AI Beginner Bot";
		case SR_COOP_IA_INTERMEDIATE:
			return "SR 5v5 Co-op vs. AI Intermediate Bot";
		case URF:
			return "SR 5v5 URF";
		case TFT_NORMAL:
			return "TFT Normal";
		case TFT_RANKED:
			return "TFT Ranked";
		default:
			return "Unknown";
		}
	}
}
