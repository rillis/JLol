package com.jlol.examples;

import java.io.IOException;

import com.jlol.LolAPI;
import com.jlol.champion.Champion;
import com.jlol.champion.ChampionList;
import com.jlol.locale.Locale;

class ChampionListExample {
	public static void main(String[] args) {
		//Token here
		LolAPI l = new LolAPI("RGAPI-x");
		//Latest LOL version
		String last_version = l.getLastVersion();
		
		try {
			Champion[] c = new ChampionList(l).getChampionList(last_version, Locale.PORTUGUESE);
			
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i].name+", "+c[i].title);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
