package com.neotech.review04;

public class Baby {
	String name;
	char gender;
	int weight;
	String hairColor;

	void talk() {
		System.out.println("Baby is talking");
	}

	void eat() {
		System.out.println(name + " is eating");
	}

	void cry() {
		System.out.println("Baby is crying");
	}

	void displayInformation() {
		System.out.println(name + ", gender is " + gender + ", hair color is " + hairColor);
	}

	public static void main(String[] args) {
		Baby baby1 = new Baby();
		baby1.name = "Pedro";
		baby1.weight = 18;

		System.out.println("The name of baby is " + baby1.name);
		System.out.println("The hair color of baby is " + baby1.hairColor);

		baby1.hairColor = "purple";
		baby1.gender = 'm';
		System.out.println("the hair color of baby is " + baby1.hairColor);

		System.out.println("----------");
		Baby baby2 = new Baby();
		System.out.println("the name of baby2 is " + baby2.name);
		baby2.gender = 'F';
		baby2.hairColor = "yellow";

		baby1.cry();
		baby2.eat();

		baby2.name = "Ismail";
		baby2.eat();

		System.out.println("---------");
		baby1.displayInformation();

	}

}
