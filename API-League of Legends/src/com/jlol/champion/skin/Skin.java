package com.jlol.champion.skin;

public class Skin {
	public String lol_id;
	public int id;
	public String name;
	public boolean chromas;
	
	public Skin(String lol_id, int id, String name, boolean chromas) {
		this.lol_id = lol_id;
		this.id = id;
		this.name = name;
		this.chromas = chromas;
	}
}
