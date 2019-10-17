# JLol
A League of Legends API for Java

### Setup
Download the [latest release](https://github.com/rillis/JLol/releases/latest), put every JAR file in your project buildpath.
You'll need to instantiate an LolAPI type object:

```java
import com.jlol.*;

LolAPI api = new LolAPI("LOL API-KEY HERE");
```

### Doc
com.jlol.LolAPI throws InvalidToken
```java
getToken() : String
getLastVersion() : String
```
com.jlol.champion.ChampionList
```java
getChampionList(String version, String Locale) : Champion[]

Locale example: Locale.ENGLISH_US (com.jlol.locale.Locale)
```
com.jlol.champion.Champion throws ChampionNotFound
```java
getImageURL(String version) : String
getSplashImageUrl() : String
getSplashImageSkinUrl(int skinId) : String
```
com.jlol.champion.skin
```java
getSkinListFromChampion(Champion c, String version, String locale) : Skin[]
```

Methods to get a Champion (com.jlol.champion.Champion):

Method 1: Getting from list.
```java
	LolAPI l = null;
	try {
		l = new LolAPI("RGAPI-x");
	} catch (InvalidToken e1) {
		e1.printStackTrace();
	}
	String last_version = l.getLastVersion();
	try {
		Champion[] c = new ChampionList(l).getChampionList(last_version, Locale.PORTUGUESE);
	} catch (IOException e) {
		e.printStackTrace();
	}
```

Method 2: Searching.
```java
	LolAPI l = null;
	try {
		l = new LolAPI("RGAPI-x");
	} catch (InvalidToken e1) {
		e1.printStackTrace();
	}
	
	String champID = "wu ko ng";
	
	Champion champ = null;
	try {
		champ = new Champion(champID, l, l.getLastVersion(), Locale.PORTUGUESE);
		System.out.println(champ.name); //Wukong
		System.out.println(champ.id); //MonkeyKing
		System.out.println(champ.stats.attackDamage); //68.0
	} catch (ChampionNotFound e) {
		e.printStackTrace();
	}
```