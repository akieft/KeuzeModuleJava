package com.in28minutes.oops;

public class StringRunner {

	public static void main(String[] args) {

		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saterday" };

		String dayWithMostCharacters = "";

		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}

		System.out.println("Day with Most number of characters " + dayWithMostCharacters);

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}
}
