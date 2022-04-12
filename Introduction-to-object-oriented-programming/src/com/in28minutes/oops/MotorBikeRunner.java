package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike yamaha = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(yamaha.getSpeed());

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		// System.out.println(ducati.getSpeed());

		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(50);
		honda.increaseSpeed(100);
		honda.decreaseSpeed(50);

		// int ducatiSpeed = ducati.getSpeed();
		// ducatiSpeed += 100;
		// ducati.setSpeed(ducatiSpeed);

		System.out.println(ducati.getSpeed());

		// int hondaSpeed = honda.getSpeed();
		// hondaSpeed += 100;
		// honda.setSpeed(hondaSpeed);

		System.out.println(honda.getSpeed());

		// honda.setSpeed(80);
		// System.out.println(honda.getSpeed());

	}

}
