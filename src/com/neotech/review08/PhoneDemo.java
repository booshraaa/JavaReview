package com.neotech.review08;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p1 = new Phone();

		p1.setSerialNumber("R333");
		p1.setBrand("Nokia");
		p1.setPassword("urmom");

		System.out.println(p1.getBrand());
		System.out.println(p1.getPassword());
		System.out.println(p1.getSerialNumber());
	}

}
