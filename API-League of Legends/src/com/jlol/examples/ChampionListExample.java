package com.jlol.examples;

import java.io.IOException;

import com.jlol.LolAPI;
import com.jlol.champion.Champion;
import com.jlol.champion.ChampionList;
import com.jlol.exception.InvalidToken;
import com.jlol.locale.Locale;

class ChampionListExample {
	public static void main(String[] args) {
		//Token here
		LolAPI l = null;
		try {
			l = new LolAPI("RGAPI-x", "br1", Locale.PORTUGUESE);
		} catch (InvalidToken e1) {
			e1.printStackTrace();
		}
		//Latest LOL version
		String last_version = l.getLastVersion();
		
		try {
			Champion[] c = new ChampionList(l).getChampionList(last_version);
			
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i].getName()+", "+c[i].getTitle());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
