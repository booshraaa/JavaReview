package com.neotech.review06;

public class World {
	public static void main(String[] args) {
		// 1st way, (using constructor w no parameters)
		Person p1 = new Person();

		p1.name = "bro";
		p1.age = 3;
		p1.weight = 5;

		p1.info();

		System.out.println("---------------");
		// 2nd way, (using constructor w 2 parameters)
		Person p2 = new Person("brah", 34);
		p2.info();

		// if wannna add the weight later;
		p2.weight = 6;
		p2.info();
		System.out.println("---------");

		Person p3 = new Person("brodie", 50, 100);
		p3.info();
	}

}
