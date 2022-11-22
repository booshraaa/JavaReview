package com.neotech.review03;

import java.util.Scanner;

public class Task1 {
	//// Ask the user: How many numbers do you want to store in the array?
	// Ask him to enter the numbers: Read numbers and enter them into the array
	// Print the numbers from the array
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		// 1)
//		System.out.println("How many numbers do u wanna store in the array?");
//		int num = input.nextInt();
//
//		// 2)
//		int[] numbers = new int[4];
//		System.out.println("Enter the numbers");
//		int num1 = input.nextInt();
//		int num2 = input.nextInt();
//		int num3 = input.nextInt();
//		int num4 = input.nextInt();
//
//		numbers[0] = num1;
//		numbers[1] = num2;
//		numbers[2] = num3;
//		numbers[3] = num4;
//
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
		Scanner input = new Scanner(System.in);

		System.out.println("How many numbers do you want to store in the array?");
		int size = input.nextInt();

		// Declaring the array
		int[] array = new int[size];

		// Read numbers and enter them into the array
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number:");
			array[i] = input.nextInt();
		}

		// Print the numbers from the array
		System.out.println("Let's print the numbers from the array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println();

		System.out.println("Let's print the numbers using enhanced for loop");
		for (int num : array) {
			System.out.print(num + " ");
		}

	}

}
