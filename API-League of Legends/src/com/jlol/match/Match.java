package com.jlol.match;

import java.util.Date;

public class Match {
	private int gameId; //id from match
	private String platformId; //BR1, EUN1, EUW1 : region
	private Date gameCreation; //(UNIX) Datetime creation match, after picks and bans, loading screen
	private long gameDuration; //Game duration in seconds
	private int queueId; //QueueType class
	private int mapId; //Maps class
	private int seasonId; //Seasons class
	private String gameVersion; //XX.XX.XXX.XXX
	private String gameVersionMajor; //XX.XX
	private String gameMode; //GameMode class
	private String gameType; //GameType class
	
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

	public int getGameId() {
		return gameId;
	}

	public String getPlatformId() {
		return platformId;
	}

	public Date getGameCreation() {
		return gameCreation;
	}

	public long getGameDuration() {
		return gameDuration;
	}

	public int getQueueId() {
		return queueId;
	}

	public int getMapId() {
		return mapId;
	}

	public int getSeasonId() {
		return seasonId;
	}

	public String getGameVersion() {
		return gameVersion;
	}

	public String getGameVersionMajor() {
		return gameVersionMajor;
	}

	public String getGameMode() {
		return gameMode;
	}

	public String getGameType() {
		return gameType;
	}

	public Team[] getTeams() {
		return teams;
	}

	public Participant[] getParticipants() {
		return participants;
	}
	
	
}
