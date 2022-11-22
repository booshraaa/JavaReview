package com.neotech.review01;

public class VariableDemo {
	public static void main(String[] args) {
		//1. Declaring a variable
		//2. /assigning a value
		
		String firstName;
		firstName = "Busra";
		
		System.out.println("My first name is "+firstName);
		
		
		String lastName = "Kara";
		int age = 19;
		
		System.out.println(firstName+" "+lastName+" "+age);
		System.out.println(firstName+" "+lastName+" "+(age +1));
		
		//After 5 years
		age += 5;
		lastName = "Anniston";
		
		System.out.println("After getting married!");
		System.out.println(firstName+" "+lastName+" "+age);
		
		lastName += "Pitt";
		System.out.println(firstName+" "+lastName+" "+age);
		
		
		
		
		
		
		
		
	}

}
