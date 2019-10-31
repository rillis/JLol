package com.jlol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Methods {
	public static String getWebsiteContent(String url) throws IOException{
		URL uri= new URL(url);
        URLConnection ec = uri.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(ec.getInputStream(), "UTF-8"));
        String inputLine;
        StringBuilder a = new StringBuilder();
        while ((inputLine = in.readLine()) != null)
            a.append(inputLine);
        in.close();
        return a.toString();
	}
	
	public static String encodeValue(String value) {
		value = value.replaceAll(" ", "RGARGA271");
        try {
        	
            value =  URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
            
            return value.replaceAll("RGARGA271","%20");
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }
}
