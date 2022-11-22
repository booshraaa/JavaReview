package com.neotech.review08;

import java.util.LinkedList;
import java.util.List;

public class LinkedListIntro {
	public static void main(String[] args) {
		List<String> asia = new LinkedList<>(); // UP casting

		asia.add("Japan");
		asia.add("Taiwaan");
		asia.add("Turkey");
		asia.add(0, "Cambodia");
		asia.add("Taiwaan");
		asia.add("Japan"); // u can add duplicates, Japan is 2 times
		System.out.println(asia);

		// iterate asia and remove duplicates

		List<String> asia2 = new LinkedList<>();
		for (String country : asia) {
			if (asia2.contains(country)) {
				System.out.println("The country " + country + " already exists");
			} else {
				asia2.add(country);
			}
		}
		System.out.print("Asia 2 --> " + asia2);

	}

}
