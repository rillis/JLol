package com.jlol;

import java.io.IOException;

public class LolAPI {
	private String token;
	public LolAPI(String token) {
		this.token = token;
		
		if(!checkToken(token)) {
			System.err.println("Invalid Token");
		}
	}
	public String getToken() {
		return token;
	}
	private boolean checkToken(String token) {
		try {
			Methods.getWebsiteContent("https://br1.api.riotgames.com/lol/platform/v3/champion-rotations?api_key="+token);
			return true;
		}catch(IOException e) {
			return false;
		}
	}
}
