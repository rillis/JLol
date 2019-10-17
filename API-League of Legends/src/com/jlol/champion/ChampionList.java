package com.jlol.champion;

import java.io.IOException;
import java.util.Iterator;
import org.json.JSONObject;

import com.jlol.LolAPI;
import com.jlol.Methods;
import com.jlol.exception.ChampionNotFound;

public class ChampionList {
	String token;
	public ChampionList(LolAPI api) {
		this.token = api.getToken();
	}
	
	public Champion[] getChampionList(String version, String locale) throws IOException {
		
		String response = Methods.getWebsiteContent("http://ddragon.leagueoflegends.com/cdn/"+version+"/data/"+locale+"/champion.json");
		
		JSONObject path = new JSONObject(response);
		
		JSONObject champs = path.getJSONObject("data");
		
		Champion[] championList = new Champion[champs.length()];
		
		Iterator<String> keys = champs.keys();
		
		int i = 0;
		while(keys.hasNext()) {
		    String key = keys.next();
		    JSONObject champ = champs.getJSONObject(key);
		    
		    ChampionInfo info = new ChampionInfo(champ.getJSONObject("info").getInt("attack"),champ.getJSONObject("info").getInt("defense"),champ.getJSONObject("info").getInt("magic"),champ.getJSONObject("info").getInt("difficulty"));
		    ChampionStats stats = new ChampionStats(champ.getJSONObject("stats").getDouble("hp"),champ.getJSONObject("stats").getDouble("hpperlevel"),champ.getJSONObject("stats").getDouble("mp"),champ.getJSONObject("stats").getDouble("mpperlevel"),champ.getJSONObject("stats").getDouble("movespeed"),champ.getJSONObject("stats").getDouble("armor"),champ.getJSONObject("stats").getDouble("armorperlevel"),champ.getJSONObject("stats").getDouble("spellblock"),champ.getJSONObject("stats").getDouble("spellblockperlevel"),champ.getJSONObject("stats").getDouble("attackrange"),champ.getJSONObject("stats").getDouble("hpregen"),champ.getJSONObject("stats").getDouble("hpregenperlevel"),champ.getJSONObject("stats").getDouble("mpregen"),champ.getJSONObject("stats").getDouble("mpregenperlevel"),champ.getJSONObject("stats").getDouble("crit"),champ.getJSONObject("stats").getDouble("critperlevel"),champ.getJSONObject("stats").getDouble("attackdamage"),champ.getJSONObject("stats").getDouble("attackdamageperlevel"),champ.getJSONObject("stats").getDouble("attackspeedperlevel"),champ.getJSONObject("stats").getDouble("attackspeed"));
		    
		    Champion c = new Champion(champ.getString("id"),champ.getString("key"),champ.getString("name"),champ.getString("title"),champ.getString("blurb"), info,champ.getString("partype"),stats);
		    
		    championList[i] = c;
		    i++;
		}
		
		
		
		return championList;
	}
	
	Champion searchChampionByName(String version, String locale, String name) throws IOException, ChampionNotFound {
		
		name = name.replace(" ", "");
		
		String response = Methods.getWebsiteContent("http://ddragon.leagueoflegends.com/cdn/"+version+"/data/"+locale+"/champion.json");
		
		JSONObject path = new JSONObject(response);
		
		JSONObject champs = path.getJSONObject("data");
		
		Iterator<String> keys = champs.keys();
		Champion c = null;
		while(keys.hasNext()) {
		    String key = keys.next();
		    JSONObject champ = champs.getJSONObject(key);
		    
		    if(champ.getString("name").equalsIgnoreCase(name) || champ.getString("id").equalsIgnoreCase(name)) {
		    	ChampionInfo info = new ChampionInfo(champ.getJSONObject("info").getInt("attack"),champ.getJSONObject("info").getInt("defense"),champ.getJSONObject("info").getInt("magic"),champ.getJSONObject("info").getInt("difficulty"));
			    ChampionStats stats = new ChampionStats(champ.getJSONObject("stats").getDouble("hp"),champ.getJSONObject("stats").getDouble("hpperlevel"),champ.getJSONObject("stats").getDouble("mp"),champ.getJSONObject("stats").getDouble("mpperlevel"),champ.getJSONObject("stats").getDouble("movespeed"),champ.getJSONObject("stats").getDouble("armor"),champ.getJSONObject("stats").getDouble("armorperlevel"),champ.getJSONObject("stats").getDouble("spellblock"),champ.getJSONObject("stats").getDouble("spellblockperlevel"),champ.getJSONObject("stats").getDouble("attackrange"),champ.getJSONObject("stats").getDouble("hpregen"),champ.getJSONObject("stats").getDouble("hpregenperlevel"),champ.getJSONObject("stats").getDouble("mpregen"),champ.getJSONObject("stats").getDouble("mpregenperlevel"),champ.getJSONObject("stats").getDouble("crit"),champ.getJSONObject("stats").getDouble("critperlevel"),champ.getJSONObject("stats").getDouble("attackdamage"),champ.getJSONObject("stats").getDouble("attackdamageperlevel"),champ.getJSONObject("stats").getDouble("attackspeedperlevel"),champ.getJSONObject("stats").getDouble("attackspeed"));
			    
			     c = new Champion(champ.getString("id"),champ.getString("key"),champ.getString("name"),champ.getString("title"),champ.getString("blurb"), info,champ.getString("partype"),stats);
		    
			     return c;
		    }
		    
		}
		
		
		throw new ChampionNotFound("Champion \""+name+"\" not found.");
	}
	
}
