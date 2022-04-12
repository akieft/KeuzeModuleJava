package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {

		Book taocp = new Book(1000);
		taocp.setTitle("The Art Of Computer Programming");

		Book ej = new Book(1000);
		ej.setTitle("Effective Java");

		Book cc = new Book(1000);
		cc.setTitle("Clean Code");

		System.out.println(taocp.getTitle());
		System.out.println(ej.getTitle());
		System.out.println(cc.getTitle());

		taocp.setNoOfCopies(5000);
		ej.setNoOfCopies(2000);
		cc.setNoOfCopies(10000);

	}

}
