package com.neotech.review09;

import java.util.*;

public class WorldMap {

	public static void main(String[] args) {
		Map<String, String> europe = new TreeMap<>(); // ordered by the key
		europe.put("Spain", "Madrid");
		europe.put("Germany", "Berlin");
		europe.put("Italy", "Rome");
		System.out.println(europe);

		Map<String, String> africa = new LinkedHashMap<>(); // order is preserved
		africa.put("Morroco", "Rabat");
		africa.put("South Africa", "Cape Town");
		africa.put("Egypt", "Cairo");
		System.out.println(africa);

		Map<String, String> asia = new HashMap<>(); // no order
		asia.put("Japan", "Tokyo");
		asia.put("Iran", "Tehran");
		asia.put("Tajikistan", "Dushanbe");
		System.out.println(asia);

		// HW1 iterate europe by getting keys
		// HW2 iterate africa by getting values

		System.out.println("--------WORLD--------");
		List<Map<String, String>> world = new ArrayList<>();
		world.add(europe);
		world.add(africa);
		world.add(asia);

		System.out.println(world);

		System.out.println("world size -> " + world.size());

		Map<String, String> map1 = world.get(1); // get the element with index 1
		System.out.println("map1 -> " + map1);

		System.out.println("--------Let us iterate the world--------");

		for (Map<String, String> continent : world) {
			// System.out.println(continent);

			Set<String> countryNames = continent.keySet();
			for (String country : countryNames) {
				String capitalCity = continent.get(country);
				System.out.println(country + " -> " + capitalCity);
			}

			System.out.println();
		}

		// HW only for Mustafa Kamil Kilic
		// Do it with a nested while loop

	}
}
