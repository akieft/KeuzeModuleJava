package com.in28minutes.oops;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 99, 98, 100 };
		Student student = new Student("Ranga", marks);

		int number = student.getNumberOfMarks();
		System.out.println("Number of marks : " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks : " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum of marks : " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum of marks : " + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("Average of marks : " + average);
		System.out.println(student);

		student.addMark(35);

		System.out.println(student);

		student.removeMarkAtIndex(1);

		System.out.println(student);
	}

}
