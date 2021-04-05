package com.qa.day1;

public class HelloWorld {

	// Calculator Exercise
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int result1 = Exercise1.add(5, 7);
	System.out.println(result1);
	
	double result2 = Exercise1.multiply(5, 7);
	System.out.println(result2);
	
	double result3 = Exercise1.subtract(5, 7);
	System.out.println(result3);
	
	double result4 = Exercise1.divide(15, 7);
	System.out.println(result4);
		
	
	// Results Question
	
	ResultsEx1.biology = 44;
	ResultsEx1.chemistry = 120;
	ResultsEx1.physics = 111;
	
	ResultsEx1.DisplayResults();
	ResultsEx1.PercentageResults();
		//shortcut sysout then control + space
		// use control forward slash to comment out a line in the workspace

	}

}
