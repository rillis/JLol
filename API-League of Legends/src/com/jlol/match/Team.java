package com.jlol.match;

import org.json.JSONArray;
import org.json.JSONObject;

public class Team {
	public int teamId;
	public boolean win;
	public boolean firstBlood;
	public boolean firstTower;
	public boolean firstInhibitor;
	public boolean firstBaron;
	public boolean firstDragon;
	public boolean firstRiftHerald;
	public int towerKills;
	public int inhibitorKills;
	public int baronKills;
	public int dragonKills;
	public int vilemawKills;
	public int riftHeraldKills;
	public int dominionVictoryScore;
	public int[] banChampionIds = new int[5];
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
}
