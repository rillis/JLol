package com.jlol.summoner;

import org.json.JSONObject;

import com.jlol.LolAPI;
import com.jlol.Methods;
import com.jlol.exception.StatementFailed;

public class Summoner {
	public String encryptedSummonerId;
	public String encryptedAccountId;
	public String encryptedPUUID;
	public String nick;
	public int profileIconID;
	public long summonerLevel;
	public long revisionDate;
	
	public Summoner(String nick, LolAPI l) {
		try {
			nick = Methods.encodeValue(nick);
			
			String response = l.runStatement("/lol/summoner/v4/summoners/by-name/"+nick);
			
			JSONObject path = new JSONObject(response);
			
			encryptedSummonerId = path.getString("id");
			encryptedAccountId = path.getString("accountId");
			encryptedPUUID = path.getString("puuid");
			this.nick = path.getString("name");
			profileIconID = path.getInt("profileIconId");
			summonerLevel = path.getLong("summonerLevel");
			revisionDate = path.getLong("revisionDate");
			
		} catch (StatementFailed e) {
			e.printStackTrace();
		}
	}
}
