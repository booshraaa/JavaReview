package com.neotech.review09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	// collection
	// list
	// set
	// queue
	// ^^^three interfaces inheriting COLLECTION interface

	// arraylist
	// linkedlist
	// ^^two classes implementing the LIST interface

	// hashset
	// linkedhashset
	// treeset
	// ^^^three classes implementing the SET interface
	public static void main(String[] args) {

		Set<String> africaLinked = new LinkedHashSet<>();// up casting
		africaLinked.add("Egypt");
		africaLinked.add("Morocco");
		africaLinked.add("Ghana");
		africaLinked.add("Somalia");

		System.out.println("linkedHashSet--> " + africaLinked);
		System.out.println("size is " + africaLinked.size());

		// africaLinked.add("Morocco");
		// size will still be 4, duplicates are IGNORED

		boolean added = africaLinked.add("Morocco");
		System.out.println("was morocco added in the set? " + added);

		// africaLinked.add(2,"Zambia");
		// CANNOT DO THIS^
		// !!!no index in linkedhashset

		System.out.println("-----------------------------");
		Set<String> africaTree = new TreeSet<>(africaLinked);

		System.out.println("TreeSet--> " + africaTree);
		// it alphabetized the list

		System.out.println("---------------");
		Set<String> africaHash = new HashSet<>();
		africaHash.addAll(africaLinked);

		System.out.println("HashSet--> " + africaHash);
		int size = africaHash.size();
		System.out.println("size is " + size);

		boolean contains = africaHash.contains("Turkey");
		System.out.println("is turkey in africa? " + contains);

		boolean isEmpty = africaHash.isEmpty();
		System.out.println("is the list empty? " + isEmpty);

		System.out.println("can i remove turkey? " + africaHash.remove("turkey"));
		// turkey isn't even in the list

		// we CANNOT add/get/remove by index in a SET
		// we can ONLY do that in a LIST

		// normal for loop does NOT WORK IN A SET
		// for(int i = 0; ........)

		System.out.println("----ITERATOR----");
		Iterator<String> it = africaHash.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		System.out.println("----FOR EACH LOOP----");
		for (String africa : africaHash) {
			System.out.print(africa + " ");
		}
		System.out.println();

	}

}
