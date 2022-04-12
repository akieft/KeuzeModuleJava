package com.in28minutes.oops;

import java.math.BigDecimal;

public class Employee extends Person {
	private String title;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setEmployerName(String employer) {
		this.employerName = employerName;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public String toString() {
		return String.format("Employee Title: %s, Employer: %s, Employee Grade: %c, Salary: %s", title, employerName,
				employeeGrade, salary);
	}
}
