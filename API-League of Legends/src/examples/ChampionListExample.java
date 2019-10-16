package examples;

import java.io.IOException;

import com.jlol.Champion;
import com.jlol.ChampionList;
import com.jlol.LolAPI;

public class ChampionListExample {
	public static void main(String[] args) {
		//Token here
		LolAPI l = new LolAPI("RGAPI-x");
		//Latest LOL version
		String last_version = l.getLastVersion();
		
		try {
			Champion[] c = new ChampionList(l).getChampionList(last_version, "en_US");
			
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i].name+", "+c[i].title);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
