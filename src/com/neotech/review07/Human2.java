package com.neotech.review07;

public class Human2 {
	public static void main(String[] args) {
		Human h1 = new Mexico("Juan");
		h1.talk();
		// what ab h1. taco??? compile error???

		// do MANUAL DOWNCASTING
		Mexico h2 = (Mexico) h1;
		h2.eatTaco();
		Mexico.planet = "Texas";
		System.out.println("Mexicans live in " + h1.planet);

	}

}
