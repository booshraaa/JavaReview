package com.neotech.review08;

public class WrapperDemo {

	// BOXING
	// until java 1.8
	int num1 = 6;
	Integer int1 = new Integer(num1);

	// UNBOXING
	int num2 = int1.intValue();

	// AUTO BOXING
	int num3 = 9;
	Integer int3 = num3; // u can reverse their order as int num3=Int3

	double d1 = 4.8;
	Double d2 = d1; // AUTO BOXING

	Double d3 = 2.2;
	double d4 = d3; // AUTO UN BOXING

	Boolean b1 = true; // AUTO BOXING

	Character c1 = 'G'; // AUTO BOXING

}
