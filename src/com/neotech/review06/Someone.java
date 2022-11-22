package com.neotech.review06;

public class Someone {

	String name;
	int age, weight;

	public Someone(String pname, int page, int pweight) {
		name = pname;
		age = page;
		weight = pweight;
	}

	public void info() {
		System.out.println("name: " + name + ", age: " + age + ", weight: " + weight);
	}

	public static void main(String[] args) {
		Someone s1 = new Someone("Bro", 7, 100);
		s1.info();
	}

}
