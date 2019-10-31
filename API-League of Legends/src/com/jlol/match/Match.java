package com.jlol.match;

import java.util.Date;

public class Match {
	public int gameId; //id from match
	public String platformId; //BR1, EUN1, EUW1 : region
	public Date gameCreation; //(UNIX) Datetime creation match, after picks and bans, loading screen
	public long gameDuration; //Game duration in seconds
	public int queueId; //QueueType class
	public int mapId; //Maps class
	public int seasonId; //Seasons class
	public String gameVersion; //XX.XX.XXX.XXX
	public String gameVersionMajor; //XX.XX
	public String gameMode; //GameMode class
	public String gameType; //GameType class
	
	public Team[] teams;
	
	public Participant[] participants;

	public Match(int gameId, String platformId, Date gameCreation, long gameDuration, int queueId, int mapId,
			int seasonId, String gameVersion, String gameVersionMajor, String gameMode, String gameType, Team[] teams,
			Participant[] participants) {
		this.gameId = gameId;
		this.platformId = platformId;
		this.gameCreation = gameCreation;
		this.gameDuration = gameDuration;
		this.queueId = queueId;
		this.mapId = mapId;
		this.seasonId = seasonId;
		this.gameVersion = gameVersion;
		this.gameVersionMajor = gameVersionMajor;
		this.gameMode = gameMode;
		this.gameType = gameType;
		this.teams = teams;
		this.participants = participants;
	}
	
	
}
