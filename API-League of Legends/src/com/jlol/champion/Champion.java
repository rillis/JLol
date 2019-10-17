package com.jlol.champion;

import java.io.IOException;

import com.jlol.LolAPI;
import com.jlol.exception.ChampionNotFound;

public class Champion {
	public String id;
	public String key;
	public String name;
	public String title;
	public String blurb;
	public ChampionInfo info;
	public String parType;
	public ChampionStats stats;
	
	public Champion(String searchId, LolAPI api, String version, String locale) throws ChampionNotFound {
		Champion c = null;
		try {
			c = new ChampionList(api).searchChampionByName(version, locale, searchId);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			this.id = c.id;
			this.key = c.key;
			this.name = c.name;
			this.title = c.title;
			this.blurb = c.blurb;
			this.info = c.info;
			this.parType = c.parType;
			this.stats = c.stats;
	}
	
	Champion(String id, String key, String name, String title, String blurb, ChampionInfo info, String parType, ChampionStats stats) {
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
