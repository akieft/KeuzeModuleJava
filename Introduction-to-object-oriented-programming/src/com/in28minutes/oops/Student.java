package com.in28minutes.oops;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int[] marks) {
		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {

		return marks.size();

	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(marks.size()), 3, RoundingMode.UP);
		return average;
	}

	public int getMaximumMark() {

		return Collections.max(marks);
		// int max = Integer.MIN_VALUE;
		// for (int mark : marks) {
		// if (mark > max) {
		// max = mark;
		// }
		// }
		// return max;
	}

	public int getMinimumMark() {

		return Collections.min(marks);
		// int min = Integer.MAX_VALUE;
		// for (int mark : marks) {
		// if (mark < min) {
		// min = mark;
		// }
		// }
		// return min;
	}

	public String toString() {
		return name + marks;
	}

	public void addMark(int mark) {
		marks.add(mark);

	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);

	}
}
