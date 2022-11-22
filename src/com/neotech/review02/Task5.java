package com.neotech.review02;

import java.util.Scanner;

public class Task5 {
	// ask the user to enter a + num & add it to the total
	// enter -1 to stop. -1 won't be added
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number = 0;
		int total = 0;

		System.out.println("Enter a positive number, to stop, enter -1");
		number = input.nextInt();

		while (number != -1) {
			total += number;

			System.out.println("enter a positive number, enter -1 to STOP");
			number = input.nextInt();

		}
		System.out.println("total = " + total);

//		for () {
//		if (number == -1) {
//			System.out.println("STOP");
//			}
//		}

	}

}
