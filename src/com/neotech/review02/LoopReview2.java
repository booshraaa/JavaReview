package com.neotech.review02;

public class LoopReview2 {
	public static void main(String[] args) {
		// celebrate bday from 11 to 20 w/o 13

		int age = 11;
		for (age = 11; age <= 20; age++) {
			if (age != 13) {
				System.out.println("Happy b-day, you're " + age + " years old");
			}

		}
		System.out.println("-----------");
		System.out.println("While loop");

		int age2 = 10;

		while (age2 < 20) {
			age2++;
			if (age2 == 13) {
				System.out.println("spooky 13th");
				continue;
			}
			System.out.println("Happy b-day, you're " + age2 + " years old");

		}

	}

}
