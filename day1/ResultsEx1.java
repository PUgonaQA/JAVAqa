package com.qa.day1;

// Results Question
public class ResultsEx1 {
	
	static int physics;
	static int chemistry;
	static int biology;
	
	static int total;
	static int percentage;
	//Initialises the variables
	
	public static void DisplayResults() {
		total = physics + chemistry + biology;
		// Adds the variables together based for the total
		
		String result = "Physics:" + physics + "  Chemistry:" + chemistry + "  Biology:" + biology + "  Total: " + "(OveralResult/450)";
		
		System.out.println(result);
	}
	
	public static void PercentageResults() {
		total = physics + chemistry + biology;
		
		System.out.println("Percentage Result: " + (total * 100/450) + "%");
	}
}
