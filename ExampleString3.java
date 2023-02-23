package com.ericsson.str;

public class ExampleString3 {
	public static void main(String[] args) {
		String name = "Welcome to careertuner";
		//String name2 = "telsson";
		
		
		System.out.println(name.contentEquals("Welcome to careertuner"));
		System.out.println(name.contentEquals("Welcome to "));
	}
}
