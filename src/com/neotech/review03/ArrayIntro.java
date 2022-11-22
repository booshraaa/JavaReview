package com.neotech.review03;

public class ArrayIntro {
	public static void main(String[] args) {
		int[] array = { 3, 4, 5, 6 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);

		int SUM = 0;
		for (int element : array) {
			SUM += element;
		}

		System.out.println(sum);
		System.out.println("--------------------");

		String[] animals = { "Tiger", "Lion", "Cheetah" };
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();

		for (String elements : animals) {
			System.out.print(elements + " ");
		}

		System.out.println("-----------");

		// reverse order
		for (int i = animals.length - 1; i >= 0; i--) {
			System.out.print(animals[i] + " ");
		}

	}

}
