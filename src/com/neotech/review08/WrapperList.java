package com.neotech.review08;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperList {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		boolean isEmpty = numbers.isEmpty();
		System.out.println("Is it empty? " + isEmpty);
		System.out.println("The size is " + numbers.size());

		numbers.add(new Integer(5)); // LONG WAY
		numbers.add(6); // SHORT WAY ; AUTO BOXING

		numbers.add(2);
		numbers.add(4);
		System.out.println("The size is now " + numbers.size());

		// List is an interface
		// Arraylist and linkedlist are classes implementing the list interface

		boolean contains = numbers.contains(8);
		System.out.println("Does the list contain 8? " + contains);

		System.out.println(numbers);

		numbers.remove(1); // remove by index
		numbers.remove(new Integer(4)); // remove by object
		System.out.println(numbers);

		System.out.println("with a normal loop");
		for (int i = 0; i < numbers.size(); i++) {
			int element = numbers.get(i); // auto UNboxing
			System.out.println(element);
		}

		System.out.println("With a for each loop");
		for (Integer element : numbers) {
			System.out.println(element);
		}

		System.out.println("with using iterator");
		Iterator<Integer> it = numbers.iterator(); // get the iterator from the list

		// 3 methods
//		it.hasNext(); // checking if there's another element
//		it.next(); // will get and return the next element
//		it.remove(); // will remove the current element

		System.out.println(it.hasNext()); // true
		System.out.println(it.next()); // 5
		System.out.println(it.next()); // 2

		// TASK
		// iterate the numbers using iterator
		while (it.hasNext()) {
			int element = it.next();
			System.out.println(element);
		}

	}

}
