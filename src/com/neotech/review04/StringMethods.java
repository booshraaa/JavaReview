package com.neotech.review04;

public class StringMethods {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.length()); // 5
		System.out.println(str.isEmpty());// false
		System.out.println(str.toUpperCase());// HELLO
		System.out.println(str.toLowerCase());// hello
		System.out.println(str);// Hello

		boolean stresult = str.equals("hello");// (needs return type boolean)
		System.out.println(stresult); // false

		System.out.println(str.equalsIgnoreCase("hello"));// true
		System.out.println(str.contains("HELL")); // false
		System.out.println(str.contains("Hell")); // true
		System.out.println("HELL".toLowerCase()); // hell

		boolean strstarts = str.startsWith("p");// (needs return type boolean)
		System.out.println(strstarts); // false

		System.out.println("Does Hello start with 0?");//
		System.out.println(str.startsWith("o")); // false

		String name = "Busra" + " " + "Kara";
		System.out.println(name); // Busra Kara

		String name2 = "Busra".concat("-").concat("Kara");// Method chaining
		System.out.println(name2);

		String name3 = "Busra".toUpperCase().concat("-").concat("Kara");// Method chaining
		System.out.println(name3); // BUSRA-kara

		System.out.println("Busra".length() + 2);// (busra)5+2

		String str2 = "   Busra Kara"; // " Busra kara"
		System.out.println(str2.trim()); // "Busra kara"
		System.out.println(str2.trim().length());// space in between busra & kara counts

		String str3 = "Elion";
		char letter = str3.charAt(4);
		System.out.println(letter); // n

		System.out.println(str3.indexOf('i'));// 2

		str3.indexOf('s', 6);

		String longStr = "I am very happy today";
		String anotherStr = longStr.substring(5, 7);
		System.out.println(anotherStr); // ve

		String anotherStr2 = longStr.substring(5);
		System.out.println(anotherStr2);// very happy today

		System.out.println("longStr--> " + longStr);

		longStr = longStr.substring(10); // reassigning
		System.out.println("longstr--> " + longStr);

		// longStr.substring(5, 100); ERROR

	}

}
