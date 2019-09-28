package com.dog.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlChecker {
	public static boolean isValidUrl(String url) {
		try {
			Pattern urlPattern = Pattern.compile("^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]");
			Matcher urlMatcher = urlPattern.matcher(url);
			return urlMatcher.matches();
		} catch (Exception e) {
			return false;
		}
	}
}
