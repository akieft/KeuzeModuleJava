package com.in28minutes.oops;

public class MotorBike {

	// state
	private int speed;

	MotorBike() {
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	// void setSpeed(int speed) {
	// this.speed = speed;
	// }

	// int getSpeed() {
	// return this.speed;
	// }

	void start() {
		System.out.println("Bike Started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		// System.out.println(speed);//100
		// System.out.println(this.speed);//0
		if (speed > 0)
		this.speed = speed;
		// System.out.println(speed);// 100
		// System.out.println(this.speed);// 100
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
}
