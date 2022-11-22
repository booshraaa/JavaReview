package com.neotech.review02;

public class DoWhileLoopReview {
	public static void main(String[] args) {
		// whatever u do with a do while loop, u can do w a while loop
		// similarities between while and do while

		int age = 1;

		while (age <= 10) {
			System.out.println("Happy birthday! you're " + age + " years old!");
			age++;
		}
		System.out.println("-----------------------");

		int age2 = 1;
		do {
			System.out.println("Happy birthday! you're " + age2 + " years old!");
			age2++;

		} while (age2 <= 10);

		System.out.println("----------");
		System.out.println("differences between while and do while");

		boolean hot = true;
		while (!hot) {
			System.out.println("while --> drink");
		}
		do {
			System.out.println("do while --> drink");
		} while (!hot);
	}

}
