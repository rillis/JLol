package com.jlol.match;

import com.jlol.summoner.Summoner;

public class Participant {
	public int paticipantId;
	public int teamId;
	public int championId;
	public int spell1Id; //SummonerSpells class
	public int spell2Id; //SummonerSpells class
	public ParticipantStats stats;
	public ParticipantTimeline timeline;
	public Summoner player;
	
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
}
