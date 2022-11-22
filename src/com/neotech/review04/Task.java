package com.neotech.review04;

public class Task {
	void sayGreetingWithNumber(int n, String greeting) {
		for (int i = 1; i <= n; i++) {
			System.out.print(greeting + " ");
		}
	}

	public static void main(String[] args) {
		Task n = new Task();
		n.sayGreetingWithNumber(5, "Hi");

	}

}
