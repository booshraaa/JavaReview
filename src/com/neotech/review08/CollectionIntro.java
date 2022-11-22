package com.neotech.review08;

//imports everything
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIntro {
	public static void main(String[] args) {

		// List is an Interface
		// List<String> names = new List<>();
		// can NOT do this^^^

		List<String> africa = new ArrayList<>(); // UP CASTING
		africa.add("Kenya");
		africa.add("Rwanda");
		africa.add("Somalia");
		africa.add(1, "Egypt"); // adding by index
		System.out.println(africa);

		// merging 2 arrays
		// empty list
		List<String> africa2 = new ArrayList<>();
		africa2.addAll(africa);
		System.out.println(africa2);

		// 3rd way
		// filled list
		List<String> africa3 = new ArrayList<>(africa);
		System.out.println(africa3);
///////////////////////////////////////////////////////////////
		System.out.println("------First way of iterating-------------");
		for (int i = 0; i < africa.size(); i++) {
			String country = africa.get(i);
			System.out.print(country + " ");
		}
		System.out.println();
///////////////////////////////////////////////////////////////
		System.out.println("------2nd way of iterating---------");
		for (String country : africa) {
			System.out.print(country + " ");
		}
		System.out.println();
////////////////////////////////////////////////////////////////
		System.out.println("------3rd way of iterating---------");
		Iterator<String> it = africa.iterator();
		while (it.hasNext()) {
			String country = it.next();
			System.out.print(country + " ");
		}
		System.out.println();
/////////////////////////////////////////////////////////////////	
		// Non-Generic
		// you can store anything like string, int, boolean
		// not a recommended method
		ArrayList europe = new ArrayList();
		europe.add("Italy");
		europe.add(3);
		europe.add(true);
		System.out.println(europe);

		for (Object element : europe) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
