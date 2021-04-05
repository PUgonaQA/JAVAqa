package com.qa.TestingLearning;

public class Arrays {
	
	public static void ArrayTest() {
		
		int[] numbers = new int[5];
		numbers [0] = 2;
		numbers [1] = 5;
		numbers [4] = 15;
		//Only 3 numbers in the array have been defined. The rest will be 0.
		
		System.out.println("1. Reference array string: " + numbers);
		//Prints the address of the array in memory 
		
		
		int[] sqNumbers = new int[] {1, 4, 9, 16, 25, 36};
		
		System.out.println("2. Specific number from array: " + sqNumbers[4]);
		//Finds a specific array number are prints it out
		
		System.out.println("3. Prints the length of the array: " + sqNumbers.length);
		//Code used to print out the length of the array
		
		
		/////////////////////////////////////////////////////////////
		int [][] multiArray = new int[][] {{5, 21, 43}, {3, 23, 312, 54}};
		System.out.println(multiArray[0][1]);
		// Prints out a number from the first row, and the second number
		//Each bracket represents a row of numbers
		
		System.out.println(multiArray[1][3]);
		//Prints out a number from the second row, last number
	}
	
	

}
