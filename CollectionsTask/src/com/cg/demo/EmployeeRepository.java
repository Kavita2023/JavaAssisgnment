package com.cg.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

	static List<Employee> employees = new ArrayList<>();

	static {

		employees.add(new Employee(156507, "pavan kumar", 54000.435, "consultant", "Hyderabad"));
		employees.add(new Employee(132435, "Pankaj Sharma", 62000.560, "Senior consultant", "Pune"));
		employees.add(new Employee(123090, "Prithvi", 44000.523, "consultant", "Hyderabad"));
		employees.add(new Employee(112233, "Kavita", 90234.234, "Manager", "Mumbai"));
		employees.add(new Employee(143567, "Anjulata", 89000D, "Senior consultant", "Pune"));
		employees.add(new Employee(129087, "Rahul Vikas", 76435.234, "Senior consultant", "Pune"));
		employees.add(new Employee(126587, "Ajay Kumar", 56000.345, "Manager", "Bangalore"));
	}

	public static List<Employee> getEmployees() {
		return employees;
	}

	public static void setEmployees(List<Employee> employees) {
		EmployeeRepository.employees = employees;
	}

}
