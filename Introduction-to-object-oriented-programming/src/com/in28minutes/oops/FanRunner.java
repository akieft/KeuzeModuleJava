package com.in28minutes.oops;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Fan-Tastic", 0.456, "GREEN");
		System.out.println(fan);
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 5);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}

}
