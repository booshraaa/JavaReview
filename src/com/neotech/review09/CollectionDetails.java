package com.neotech.review09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionDetails {
	public static void main(String[] args) {

		// 1. List preserves insertion order, set does NOT
		// 2. List contains duplicates, set contains unique objects

		// list is a man's wallet
		// set is a woman's purse

		// collection framework --> ALL interfaces and implementation
		// collection interface --> only one interface
		// collections --> it's a helper class

		Set<Integer> nums = new HashSet<>();

		nums.add(55);
		nums.add(26);
		nums.add(21);
		nums.add(78);
		System.out.println("hashset is random--> " + nums);

		Collections.min(nums);
		System.out.println("minimum is --> " + Collections.min(nums));

		System.out.println("maximum is --> " + Collections.max(nums));

		// set CANNOT be sorted
		// Collections.sort(nums);

		System.out.println("----------------------");
		// list CAN be sorted
		List<Integer> numslist = new ArrayList<>(nums);

		System.out.println("list before sorting --> " + numslist);

		Collections.sort(numslist);
		System.out.println("list after sorting --> " + numslist);

		System.out.println("----------------");
		List<String> students = new LinkedList<>();
		students.add("betim");
		students.add("shirina");
		students.add("dardan");
		students.add("emine");
		students.add("murad");
		students.add("aykut");
		System.out.println(students);

		String min = Collections.min(students);
		System.out.println("first --> " + min);

		String max = Collections.max(students);
		System.out.println("last --> " + max);

		Collections.sort(students);
		System.out.println(students);

		System.out.println("-----------------------");
		int[] arr = { 9, 2, 8, 5, 1 };

		Arrays.sort(arr);
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();

	}
}
