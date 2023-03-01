package com.cg.demo;

import java.util.List;

public class EmployeeService {

	List<Employee> list = EmployeeRepository.getEmployees();

	public Employee getEmployee(int id, String name) {
		//display the Employee details based on id or name   iterate the list check id and name when matching return obj
		return null;
	}

	public List<Employee> getEmployees(Double salary) {
		// display the names of employees who are getting the salary greater than the 60000
		// salary given
		return null;
	}

	public Double getMaxSalary() {
		// display the max salary
		return null;
	}

	public Double getSumOfSalary() {
		// display the sum of salaries of all the employees
		return null;

	}

	public List<String> getNames(String city) {
		// display the names of all employees who are working in 'Pune'
		return null;
	}

	public List<Employee> getDetails() {
		// display all employees based on salary ascending

		return null;
	}

	public List<Employee> getManagers() {
		// display all employees who are working as managers
		return null;
	}

	public Double getSumOfManagerSalaries() {
		// display the sum of salaries of employees who are working as managers
		return null;
	}

	public List<String> getIds() {
		// display the ids of all employees
		return null;
	}
}
