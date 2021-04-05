package com.qa.TestingLearning;

import java.util.Scanner;

public class Scanners {
	
	public static void NewScanner() {
		
		@SuppressWarnings("resource")
		Scanner scann = new Scanner(System.in);
		System.out.print("Input your Age: ");
		byte age = scann.nextByte();
			
		
		@SuppressWarnings("resource")
		Scanner can = new Scanner(System.in);
		System.out.println("Input your Name: ");
		String name = can.nextLine().trim();
		// The function nextline allows all the text inputted to be displayed.
		// The trim function reduces the amount of unnessacary spaces
		
		System.out.println("Your name is " + name + " and I am " + age + " years old.");
		
	}

}


