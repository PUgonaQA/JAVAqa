package com.qa.TestingLearning;

public class Arithmetic {
	
	public static void Formulae() {
		
		int a = 10;
		int b = 3;
		//Initialise some values for the formulae
		
		int addition = a + b;
		System.out.println("1. Add: 10+3 = " + addition);
		
		int subtraction = a - b;
		System.out.println("2. Subtract: 10-3 = " + subtraction);
		
		int multiply = a * b;
		System.out.println("3. Multiply: 10*3 = " + multiply);
		
		int divide = a / b;
		System.out.println("4. Divide: 10/3 = " + divide);
		// Prints the result of the division without the remainder
		
		int modulus = a % b;
		System.out.println("5. Modulus: 10%3 = " + modulus);
		// Prints out the remainder of the division of 10/3
		
		double doub = (double)a / (double)b;
		System.out.println("6. Double: 10/3 = " + doub);
		// Above is used to obtain the decimal points with the division
		
		////////////////////////////////////////////////////////////////
		
		int c = a++;
		System.out.println("7. a++ = " + a);
		System.out.println("8. c = " + c);
		// ++ is in increment operator
		// a gets changed to 11 using the increment
		// c retains the initial a value
		
		int d = --b;
		System.out.println("9. --b = " + b);
		System.out.println("10. d = " + d);
		// The decrement operator -- before a integer changes the value beforehand
		// Therefore, both the d and b values get decremented.
		
		int x = 1;
		System.out.println("11. x = " + x);
		x += 5;
		System.out.println("12. x+=6 = " + x);
		// The augmented value operator (+=) increases the value by the specified amount
		
		int y = 10;
		System.out.println("13. y = " + y);
		y -= 3;
		System.out.println("14. y-=3 = " + y);
		// The decremented value operator decreases the value by the specified amount
		
		String and = "44.5";
		float next = Float.parseFloat( and) + 5;
		System.out.println(next);
		// Wrapper class
		
		
		String ben = "44.4";
		Double cheese = Double.parseDouble(ben) + 5;
		System.out.println(cheese);
		// Wrapper class
		
	}

}
