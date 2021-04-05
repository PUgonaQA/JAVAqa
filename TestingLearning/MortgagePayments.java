package com.qa.TestingLearning;

public class MortgagePayments {
////programs calculates the monthly payments.
	// the Mortgage is the monthly payments. 
	
	public static void Mortgage() {
		int P = 100000;
		double IR = 3.92;
		int period = 30;
		
		double r = IR / 12;
		double n = period*12;
		
		double y = 1 + r;
		double x = Math.pow(y, n);
		
		double M = ((r*x)/(x-1))*P;
		System.out.println("Monthly Mortgage Payments: " + M);
	}
	
}
