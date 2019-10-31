package com.jlol.champion;

public class ChampionStats {
	//mp = mana, spellblock = magic resistance
	private double hp;
	private double hpPerLevel;
	private double mp;
	private double mpPerLevel;
	private double moveSpeed;
	private double armor;
	private double armorPerLevel;
	private double spellBlock;
	private double spellBlockPerLevel;
	private double attackRange;
	private double hpRegen;
	private double hpRegenPerLevel;
	private double mpRegen;
	private double mpRegenPerLevel;
	private double crit;
	private double critPerLevel;
	private double attackDamage;
	private double attackDamagePerLevel;
	private double attackSpeedPerLevel;
	private double attackSpeed;
	
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

	public double getHp() {
		return hp;
	}

	public double getHpPerLevel() {
		return hpPerLevel;
	}

	public double getMp() {
		return mp;
	}

	public double getMpPerLevel() {
		return mpPerLevel;
	}

	public double getMoveSpeed() {
		return moveSpeed;
	}

	public double getArmor() {
		return armor;
	}

	public double getArmorPerLevel() {
		return armorPerLevel;
	}

	public double getSpellBlock() {
		return spellBlock;
	}

	public double getSpellBlockPerLevel() {
		return spellBlockPerLevel;
	}

	public double getAttackRange() {
		return attackRange;
	}

	public double getHpRegen() {
		return hpRegen;
	}

	public double getHpRegenPerLevel() {
		return hpRegenPerLevel;
	}

	public double getMpRegen() {
		return mpRegen;
	}

	public double getMpRegenPerLevel() {
		return mpRegenPerLevel;
	}

	public double getCrit() {
		return crit;
	}

	public double getCritPerLevel() {
		return critPerLevel;
	}

	public double getAttackDamage() {
		return attackDamage;
	}

	public double getAttackDamagePerLevel() {
		return attackDamagePerLevel;
	}

	public double getAttackSpeedPerLevel() {
		return attackSpeedPerLevel;
	}

	public double getAttackSpeed() {
		return attackSpeed;
	}
	
	
}
