package com.jlol.match;

import org.json.JSONArray;
import org.json.JSONObject;

public class Team {
	private int teamId;
	private boolean win;
	private boolean firstBlood;
	private boolean firstTower;
	private boolean firstInhibitor;
	private boolean firstBaron;
	private boolean firstDragon;
	private boolean firstRiftHerald;
	private int towerKills;
	private int inhibitorKills;
	private int baronKills;
	private int dragonKills;
	private int vilemawKills;
	private int riftHeraldKills;
	private int dominionVictoryScore;
	private int[] banChampionIds = new int[5];
	
	
	public Team(int teamId, String win, boolean firstBlood, boolean firstTower, boolean firstInhibitor,
			boolean firstBaron, boolean firstDragon, boolean firstRiftHerald, int towerKills, int inhibitorKills,
			int baronKills, int dragonKills, int vilemawKills, int riftHeraldKills, int dominionVictoryScore, JSONArray bans) {
		this.teamId = teamId;
		this.win = win.equals("Win");
		this.firstBlood = firstBlood;
		this.firstTower = firstTower;
		this.firstInhibitor = firstInhibitor;
		this.firstBaron = firstBaron;
		this.firstDragon = firstDragon;
		this.firstRiftHerald = firstRiftHerald;
		this.towerKills = towerKills;
		this.inhibitorKills = inhibitorKills;
		this.baronKills = baronKills;
		this.dragonKills = dragonKills;
		this.vilemawKills = vilemawKills;
		this.riftHeraldKills = riftHeraldKills;
		this.dominionVictoryScore = dominionVictoryScore;
		
		for (int i = 0; i < bans.length(); i++) {
			this.banChampionIds[i] = new JSONObject(bans.get(i).toString()).getInt("championId");
		}
	}


	public int getTeamId() {
		return teamId;
	}


	public boolean isWin() {
		return win;
	}


	public boolean isFirstBlood() {
		return firstBlood;
	}


	public boolean isFirstTower() {
		return firstTower;
	}


	public boolean isFirstInhibitor() {
		return firstInhibitor;
	}


	public boolean isFirstBaron() {
		return firstBaron;
	}


	public boolean isFirstDragon() {
		return firstDragon;
	}


	public boolean isFirstRiftHerald() {
		return firstRiftHerald;
	}


	public int getTowerKills() {
		return towerKills;
	}


	public int getInhibitorKills() {
		return inhibitorKills;
	}


	public int getBaronKills() {
		return baronKills;
	}


	public int getDragonKills() {
		return dragonKills;
	}


	public int getVilemawKills() {
		return vilemawKills;
	}


	public int getRiftHeraldKills() {
		return riftHeraldKills;
	}


	public int getDominionVictoryScore() {
		return dominionVictoryScore;
	}


	public int[] getBanChampionIds() {
		return banChampionIds;
	}
	
	
}
