package com.cg.demo;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();
		
		// call the functions
		Employee emp1 = service.getEmployee(132435, null);
		System.out.println(emp1);
		
		List<Employee> emp2 = service.getEmployees(60000.0);
		System.out.println(emp2);
		
		Double emp3 = service.getMaxSalary();
		System.out.println(emp3);
		
		Double emp4 = service.getSumOfSalary();
		System.out.println(emp4);
		
		List<String> emp5 = service.getNames("Pune");
		System.out.println(emp5);
		
		List<Employee> emp6 = service.getDetails();
		System.out.println(emp6);
		
		List<Employee> emp7 = service.getManagers();
		System.out.println(emp7);
		
		Double emp8 = service.getSumOfManagerSalaries();
		System.out.println(emp8);
		
		List<String> emp9 = service.getIds();
		System.out.println(emp9);
	}

}

