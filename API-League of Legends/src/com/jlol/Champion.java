package com.jlol;

public class Champion {
	String id;
	String key;
	String name;
	String title;
	String blurb;
	ChampionInfo info;
	String parType;
	ChampionStats stats;
	public Champion(String id, String key, String name, String title, String blurb, ChampionInfo info, String parType, ChampionStats stats) {
		this.id = id;
		this.key = key;
		this.name = name;
		this.title = title;
		this.blurb = blurb;
		this.info = info;
		this.parType = parType;
		this.stats = stats;
	}
	
	public String getImageURL(String version) {
		return "http://ddragon.leagueoflegends.com/cdn/"+version+"/img/champion/"+id+".png";
	}
	public String getSplashImageUrl() {
		return "http://ddragon.leagueoflegends.com/cdn/img/champion/loading/"+id+"_0.jpg";
	}
	public String getSplashImageSkinUrl(int skinId) {
		return "http://ddragon.leagueoflegends.com/cdn/img/champion/loading/"+id+"_"+skinId+".jpg";
	}
}
