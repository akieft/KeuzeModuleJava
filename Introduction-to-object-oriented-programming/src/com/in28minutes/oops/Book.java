package com.in28minutes.oops;

public class Book {

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	private String title;

	public void setTitle(String bookTitle) {
		title = bookTitle;
	}

	public String getTitle() {
		return title;
	}

	private int noOfCopies;


	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0)
		this.noOfCopies = noOfCopies;
	}

	public void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}

}

