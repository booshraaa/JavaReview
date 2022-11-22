package com.neotech.review07;

public class Computer {
	String brand;

	public Computer(String brand) {
		this.brand = brand;
	}

	public void run() {
		System.out.println(brand + " computer can run the system");
	}

}

class Apple extends Computer {

	public Apple(String brand) {
		super(brand);
	}

	// override run() method
	public void run() {
		System.out.println(brand + " computer runs faster");
	}

	public void safe() {
		System.out.println(brand + " is safe");
	}

}

class Lenovo extends Computer {

	public Lenovo(String brand) {
		super(brand);
	}

	@Override
	public void run() {
		System.out.println(brand + " computer runs slow");
	}

	public void saveData() {
		System.out.println(brand + " computer saves data");
	}

}

class HP extends Computer {

	String color;

	public HP(String brand, String color) {
		super(brand);
		this.color = color;
	}

	@Override
	public void run() {
		System.out.println(brand + " computer runs slower");
	}

	public void saveData() {
		System.out.println(brand + " computer has storage");
	}

}

class Dell extends Computer {

	public Dell(String brand) {
		super(brand);
	}

}
