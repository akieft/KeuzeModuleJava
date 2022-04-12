package com.in28minutes.oops;

public class Fan {
	// state
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed; // levels: 0 to 5

	// constructors

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// methods
	public String toString() {
		return String.format("Make : %s, Radius : %f, Color : %s, Is On : %b, Speed : %d", make, radius, color, isOn,
				speed);
	}

	// isOn
	/*
	 * public void isOn(boolean isOn) { this.isOn = isOn; }
	 */

	public void switchOn() {
		isOn = true;
		setSpeed((byte) 1);
	}

	public void switchOff() {
		isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}
}
