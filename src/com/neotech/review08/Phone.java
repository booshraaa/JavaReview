package com.neotech.review08;

public class Phone {

	private String serialNumber, brand, password;

//	public Phone(String brand, String serialNumber, String password) {
//		this.serialNumber = serialNumber;
//		this.brand = brand;
//		this.password = password;
//	}

	public void Info() {
		System.out.println("This is a " + brand + " phone with SN " + serialNumber);
	}

	public String getSerialNumber() {
		return serialNumber;

	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// GETTERS AND SETTERS

}
