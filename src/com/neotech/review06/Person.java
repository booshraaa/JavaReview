package com.neotech.review06;

public class Person {

	// instance variables
	public String name;
	int age;
	protected int weight;

	public Person() {
		// default constructor made by java
	}

	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
		// weight = pWeight;
	}

	public Person(String pName, int pAge, int pWeight) {
		this(pName, pAge);
		weight = pWeight;
	}

	public void info() {
		System.out.println("Name: " + name + " age: " + age + " weight: " + weight);
	}
}
