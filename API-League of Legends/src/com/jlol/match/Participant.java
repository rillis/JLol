package com.jlol.match;

import com.jlol.summoner.Summoner;

public class Participant {
	private int paticipantId;
	private int teamId;
	private int championId;
	private int spell1Id; //SummonerSpells class
	private int spell2Id; //SummonerSpells class
	private ParticipantStats stats;
	private ParticipantTimeline timeline;
	private Summoner player;
	
	public Participant(int paticipantId, int teamId, int championId, int spell1Id, int spell2Id, ParticipantStats stats,
			ParticipantTimeline timeline, Summoner player) {
		this.paticipantId = paticipantId;
		this.teamId = teamId;
		this.championId = championId;
		this.spell1Id = spell1Id;
		this.spell2Id = spell2Id;
		this.stats = stats;
		this.timeline = timeline;
		this.player = player;
	}

	public int getPaticipantId() {
		return paticipantId;
	}

	public int getTeamId() {
		return teamId;
	}

	public int getChampionId() {
		return championId;
	}

	public int getSpell1Id() {
		return spell1Id;
	}

	public int getSpell2Id() {
		return spell2Id;
	}

	public ParticipantStats getStats() {
		return stats;
	}

	public ParticipantTimeline getTimeline() {
		return timeline;
	}

	public Summoner getPlayer() {
		return player;
	}	
	
}
