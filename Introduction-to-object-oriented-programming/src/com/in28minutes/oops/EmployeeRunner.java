package com.in28minutes.oops;

import java.math.BigDecimal;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setName("Ranga");
		employee.setEmail("in28minutes@gmail.com");
		employee.setPhoneNumber("123-456-7890");
		employee.setTitle("Programmer Analyst");
		employee.setEmployerName("In28Minutes");
		employee.setEmployeeGrade('A');
		employee.setSalary(new BigDecimal("50000"));

		System.out.println(employee);

	}

}
