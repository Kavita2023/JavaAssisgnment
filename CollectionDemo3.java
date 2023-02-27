package com.cg.demos;

import java.util.HashMap;

public class CollectionDemo3 {

	public static HashMap<String, String> getEntries(String array[]) {
		HashMap<String, String> map = new HashMap<>();
		for (String str : array) {
			String key = str.substring(0, 3).toUpperCase();
			map.put(key, str);
		}
		return map;
	}

	public static void main(String[] args) {

		String array[] = { "goa", "kerala", "gujarat" };
		System.out.println(getEntries(array));
		// Expected output: {GOA=goa, KER=kerala, GUJ=gujarat}
	}
}
