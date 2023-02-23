package com.ericsson.str;

public class ExampleString2 {
	public static void main(String[] args) {
		String name = "java standard edition";
		 String[] name1 = name.split(" ");
		 StringBuffer sb = new StringBuffer();
		 for (int i=0;  i<name1.length; i++) {
			 sb.append(Character.toUpperCase(name1[i].charAt(0))).append(name1[i].substring(1)).append("");
		 }
		 String result = sb.toString().trim();
		 //for (String a : name1 )
			// System.out.println(a);
		 //String fristlet = name.substring(0,1);
		 //String remainlet= name.substring(1);
		 //fristlet = fristlet.toUpperCase();
		
		System.out.println(result);
	}

}