package com.jlol.summoner;

import org.json.JSONObject;

import com.jlol.LolAPI;
import com.jlol.Methods;
import com.jlol.exception.StatementFailed;

public class Summoner {
	private String encryptedSummonerId;
	private String encryptedAccountId;
	private String encryptedPUUID;
	private String nick;
	private int profileIconID;
	private long summonerLevel;
	private long revisionDate;
	
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

	public String getEncryptedSummonerId() {
		return encryptedSummonerId;
	}

	public String getEncryptedAccountId() {
		return encryptedAccountId;
	}

	public String getEncryptedPUUID() {
		return encryptedPUUID;
	}

	public String getNick() {
		return nick;
	}

	public int getProfileIconID() {
		return profileIconID;
	}

	public long getSummonerLevel() {
		return summonerLevel;
	}

	public long getRevisionDate() {
		return revisionDate;
	}
	
	
}
