package com.qa.TestingLearning;

public class Strings {
	
	public static void StringTypes() {
		
		String myName = "My name is Philip!!!";
		
		System.out.println("1. Name contains Philip: " + myName.contains("Philip"));
		// Will check the string "my name" and output a boolean for the key word
		
		System.out.println("2. Name contains Peter: " + myName.contains("Peter"));
		// Check if the string contains Peter
		
		System.out.println("3. Length of myName: " + myName.length());
		// Checks how many characters are in the string#
		
		System.out.println("4. String starts with 'My': " + myName.startsWith("My"));
		// Checks if the string starts with the specified characters
		
		System.out.println("5. String ends with 'My': " + myName.endsWith("My"));
		//Checks if the string starts with the specified characters
		
		System.out.println("6. The index/first occurence of 'i': " + myName.indexOf("i"));
		//Checks and prints the fist occurrence of a string, number or character
		
		System.out.println("7. Replace characters: " + myName.replace(" ", "-"));
		// The replace command replaces given inputs in the string
		// replaces " " with "-" in this given example
		// Does not modify the original string. STRINGS ARE IMMUTABLE
		
		String message = "8. Adding Speech Marks \"Here\" ";
		System.out.println(message);
		// use \"...\" before and after text to output speech marks
		
	}
}
