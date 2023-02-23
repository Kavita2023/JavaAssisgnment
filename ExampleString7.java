package com.ericsson.str;

public class ExampleString7 {
	public static void main(String[] args) {
		String name = "bvrit college";
		//String[] name1 = name.charAt();
		int result = name.lastIndexOf("l");
		for (int i=0;i<name.length();i++) {
			if (i==9) {
				String abc= name.toUpperCase();
				System.out.println(abc);
			}
			
		}
		
	}

}