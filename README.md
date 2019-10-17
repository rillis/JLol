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
com.jlol.LolAPI
```java
getToken() : String
getLastVersion() : String
```
com.jlol.champion.ChampionList
```java
getChampionList(String version, String Locale) : Champion[]

Locale example: Locale.ENGLISH_US (com.jlol.locale.Locale)
```
com.jlol.champion.Champion
```java
getImageURL(String version) : String
getSplashImageUrl() : String
getSplashImageSkinUrl(int skinId) : String
```
com.jlol.champion.skin
```java
getSkinListFromChampion(Champion c, String version, String locale) : Skin[]
```