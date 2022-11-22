package com.neotech.review04;

public class Method {
	public static void main(String[] args) {
		String name = "Dardan";
		int numOfchars = name.length();

		System.out.println("The length of " + name + " is " + numOfchars);

		// long way
		Method n = new Method();
		{
			boolean res = n.isOdd(57);
			System.out.println("the number 57 is odd? " + res);
		}

		// short way
		System.out.println(n.isOdd2(90));
	}

	// long way
	boolean isOdd(int num) {
		boolean result;
		if (num % 2 == 1) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	// short way
	boolean isOdd2(int n) {
		return n % 2 == 1;
	}
}
