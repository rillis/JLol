package com.jlol.champion;

public class ChampionInfo {
	private int attack;
	private int defense;
	private int magic;
	private int difficulty;
	
	public ChampionInfo(int attack,	int defense, int magic, int difficulty) {
		this.attack = attack;
		this.defense = defense;
		this.magic = magic;
		this.difficulty = difficulty;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public int getMagic() {
		return magic;
	}

	public int getDifficulty() {
		return difficulty;
	}
	
	
}
