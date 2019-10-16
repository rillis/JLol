package com.jlol;

public class ChampionStats {
	//mp = mana, spellblock = magic resistance
	double hp;
	double hpPerLevel;
	double mp;
	double mpPerLevel;
	double moveSpeed;
	double armor;
	double armorPerLevel;
	double spellBlock;
	double spellBlockPerLevel;
	double attackRange;
	double hpRegen;
	double hpRegenPerLevel;
	double mpRegen;
	double mpRegenPerLevel;
	double crit;
	double critPerLevel;
	double attackDamage;
	double attackDamagePerLevel;
	double attackSpeedPerLevel;
	double attackSpeed;
	
	public ChampionStats(double hp, double hpPerLevel, double mp, double mpPerLevel, double moveSpeed, double armor,
			double armorPerLevel, double spellBlock, double spellBlockPerLevel, double attackRange, double hpRegen,
			double hpRegenPerLevel, double mpRegen, double mpRegenPerLevel, double crit, double critPerLevel,
			double attackDamage, double attackDamagePerLevel, double attackSpeedPerLevel, double attackSpeed) {
		this.hp = hp;
		this.hpPerLevel = hpPerLevel;
		this.mp = mp;
		this.mpPerLevel = mpPerLevel;
		this.moveSpeed = moveSpeed;
		this.armor = armor;
		this.armorPerLevel = armorPerLevel;
		this.spellBlock = spellBlock;
		this.spellBlockPerLevel = spellBlockPerLevel;
		this.attackRange = attackRange;
		this.hpRegen = hpRegen;
		this.hpRegenPerLevel = hpRegenPerLevel;
		this.mpRegen = mpRegen;
		this.mpRegenPerLevel = mpRegenPerLevel;
		this.crit = crit;
		this.critPerLevel = critPerLevel;
		this.attackDamage = attackDamage;
		this.attackDamagePerLevel = attackDamagePerLevel;
		this.attackSpeedPerLevel = attackSpeedPerLevel;
		this.attackSpeed = attackSpeed;
	}
}
