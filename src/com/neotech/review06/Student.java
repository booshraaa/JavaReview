package com.neotech.review06;

public class Student {
	String name;
	int age;

	// static/class variable
	static String school;

	// constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void info() {
		System.out.println(name + " " + age + " " + school);
	}

	public static void main(String[] args) {
		Student.school = "NeoTech";

		// Student s1 = new Student();

		Student s1 = new Student("Aykut", 15);
		s1.info();

		Student s2 = new Student("ur mom", 12);
		s2.info();

	}

}
