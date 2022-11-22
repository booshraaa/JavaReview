package com.neotech.review07;

public class Computer2 {
	public static void main(String[] args) {
		Apple apple = new Apple("Apple");

		HP hp = new HP("HP", "Red");

		// 1st way creating ARRAY
		Computer c1 = new Dell("Dell"); // upcasting
		Computer c2 = new Lenovo("Lenovo"); // upcasting

		Computer[] array = { c1, c2 };

		// 2nd way creating ARRAY
		Computer[] array2 = { new Dell("Dell"), new HP("HP", "Red"), new Apple("Apple") };

		for (Computer element : array2) {
			System.out.println("The brand: " + element.brand);
			element.run();
		}

		// ARRAYS of specific class
		Apple[] appleArray = { new Apple("Apple"), new Apple("Apple2") };
	}

}
