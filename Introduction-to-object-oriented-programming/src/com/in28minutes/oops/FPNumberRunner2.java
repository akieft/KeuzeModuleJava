package com.in28minutes.oops;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner2 {

	public static void printFPSquares() {
		IntStream.range(1, 11).map(num -> num * num).forEach(elem -> System.out.println(elem));
	}

	public static void printLowerCases(List<String> list) {
	}

	public static void printLengths(List<String> list) {
		list.stream()
		.map(s -> s.length())
				.forEach(elem -> System.out.println(elem));
		}

	public static void main(String[] args) {
		printFPSquares();
		List<String> list = List.of("Apple", "Banana", "Cat");
		printLowerCases(list);
		printLengths(list);

		}


}
