package com.in28minutes.oops;

public class Person {
	private String name;
	private String email;
	private String phoneNumber;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String toString() {
		return String.format("Person %s , Email : %s, Phone Number : %s", name, email, phoneNumber);
	}
}
