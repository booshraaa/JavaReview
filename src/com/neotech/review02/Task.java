package com.neotech.review02;

public class Task {
	public static void main(String[] args) {
		// Add Even numbers
		// Also add Odd numbers
		// Also add All numbers
		// Between 1 && 50
		// Using for loop

		int oddTotal = 0;
		int evenTotal = 0;
		int total = 0;

		for (int i = 1; 1 <= 50; i++) {
			if (i % 2 == 0) {// even
				evenTotal += i;
			} else {// odd
				oddTotal += i;
			}
			total += i;

			System.out.println("the sum of even numbers is " + evenTotal);
			System.out.println("the sum of odd numbers is " + oddTotal);
			System.out.println("the sum of all numbers is " + total);
		}

//		for (int j = 1; j <= 50; j++) {
//
//			if (j % 2 == 0) {
//				evenTotal += j;
//			} else {
//				oddTotal += j;
//			}
//			System.out.println();
	}
}
