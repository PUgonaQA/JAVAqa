package com.qa.day2;


public class SwitchCaseScenario {

	public static void main(String[] args) {
		
		int in = 9;
		
		switch (in) {
		case 3:
			System.out.println("The month is March");
			break;
			
		case 6:
			System.out.println("The month is June");
			break;
		
		case 9:
			System.out.println("The month is September");
			break;
		
		case 12:
			System.out.println("The month is December");
			break;
		
		default:
			System.out.println("The specified month does not match");
			break;
		}
		
		int[] array1 = { 23, 24, 22, 42, 22, 23};
		System.out.println("Second Character:  " + array1 [1]);
	
		
		//FlowCharts.forloop();
		//FlowCharts2.forloop2();
		
		

	}
	
	
	
	

}
