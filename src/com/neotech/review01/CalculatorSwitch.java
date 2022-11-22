package com.neotech.review01;

import java.util.Scanner;

public class CalculatorSwitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

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
		} else {
			System.out.println("invalid operator");
		}

		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("Invalid operator");
			break;

		}
		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
			System.out.println("The result is --> " + result);

		}
		System.out.println("Please enter a character");
		char opp = input.next().charAt(0);
		System.out.println("Char --> " + opp);
		

	}
}
