package com.neotech.review01;

public class TypeCasting {
	public static void main(String[] args) {
		
		// byte < short < int < long < float < double
		
		int intNumber = 50;
		double doubleNumber = intNumber; //widening, implicit casting, automatic
		System.out.println("intNumber --> "+ intNumber); //50
		System.out.println("doubleNumber --> "+ doubleNumber); //50.0
		
		byte byteNumber = (byte) intNumber; //narrowing, explicit casting, manually
		System.out.println("byteNumber --> "+byteNumber);
		
		intNumber = 670; //re-assigning
		byte b2 = (byte)intNumber;
		System.out.println("b2 --> "+ b2); //data is LOST
		
		byte b3 = 90;
		int i3 = b3;                      // will NOT LOSE data
		System.out.println("i3 --> "+i3); //widening, implicit casting, automatic
		
		
		
	}

}
