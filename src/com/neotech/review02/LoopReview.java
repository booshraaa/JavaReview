package com.neotech.review02;

public class LoopReview {
	public static void main(String[] args) {
		String greeting = "Hello";

		int count = 1;
		while (count <= 5) {
			System.out.println(greeting);
			count++;
		}
		System.out.println("---------------");

		int i = 0;

		while (true) {
			if (i > 3) {
				break;
			}
			System.out.println(greeting);
			i++;
		}

	}

}
