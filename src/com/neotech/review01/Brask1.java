package com.neotech.review01;

import java.util.Scanner;

public class Brask1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ask the user to enter 2 numbers
		// Ask the user for the operator
		// solve it using if-else and using switch

		System.out.println("Enter first number");
		double num1 = input.nextDouble();

		System.out.println("enter second number");
		double num2 = input.nextDouble();
		System.out.println("first number --> " + num1);
		System.out.println("second number --> " + num2);

		System.out.println("Enter operator (+,-,*,/)");
		String operator = input.next();
		
		double result = 0;

		if (operator.equals("+")) {
			System.out.println("The result is " + (num1 + num2));
		} else if (operator.equals("-")) {
			System.out.println("The result is " + (num1 - num2));
		} else if (operator.equals("*")) {
			System.out.println("The result is " + (num1 * num2));
		} else if (operator.equals("/")) {
			System.out.println("The result is " + (num1 / num2));
		}
		else {
			System.out.println("invalid operator");
		}
		if (operator.equals("+") || operator.equals("-") || operator.equals("*") 
				|| operator.equals("/")) {
			System.out.println("The result is --> "+ result);
		}
	}

}
