package com.in28minutes.oops;

import java.util.Scanner;

public class DoWhileRepeatQuestionRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number;

		do {
		System.out.print("Enter a number:   ");
			number = scanner.nextInt();
		System.out.println("Cube is " + (number * number * number));
		} while (number >= 0);
		System.out.println("Thank you! Have fun! ");
	}

}
