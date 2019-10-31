package com.match;

import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jlol.LolAPI;
import com.jlol.exception.StatementFailed;
import com.jlol.summoner.Summoner;

public class MatchList {
	private LolAPI l;
	public MatchList(LolAPI l) {
		this.l = l;
	}
	
	
	public void getMatchList(int limit, Summoner s) {
		getList(limit, s, "?beginIndex=");
	}
	
	public void getMatchList(int limit, Summoner s, int queue) {
		getList(limit, s, "?queue="+queue+"&beginIndex=");
	}
	
	public void getMatchList(int limit, Summoner s, int queue, int championid) {
		getList(limit, s, "?queue="+queue+"&champion="+championid+"&beginIndex=");
	}
	
	public void getMatchList(int limit, Summoner s, int queue, int season, boolean debug) {
		getList(limit, s, "?queue="+queue+"&season="+season+"&beginIndex=");
	}
	
	
	private void getList(int limit, Summoner s, String mod) {
		try {
			String response = null;
			JSONObject path = null;
			JSONArray matches = null;
			int cont = -100;
			int contreal = 0;
			
			boolean satisfied = false;
			do {
				if(cont>=limit && limit!=0) {
					break;
				}
				cont += 100;
				response = l.runStatement("/lol/match/v4/matchlists/by-account/"+s.encryptedAccountId+mod+cont,true);
				path = new JSONObject(response);
				matches = path.getJSONArray("matches");
				
				for (int i = 0; i < matches.length(); i++) {
					contreal++;
					if(contreal>limit && limit!=0) {
						satisfied = true;
					}
					if(!satisfied) {
					JSONObject match = new JSONObject(matches.get(i).toString());
					
					Date time=new Date(match.getLong("timestamp"));
						System.out.println(time.toString() + " Season: " + match.getInt("season"));
					}
				}
			}
			while(matches.length() > 0 || satisfied);
		} catch (StatementFailed e) {
			e.printStackTrace();
		}
	}
	
}
