package com.cg.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    List<Employee> list = EmployeeRepository.getEmployees();

    public Employee getEmployee(int id, String name) {
        //display the Employee details based on id or name   iterate the list check id and name when matching return obj
        for(Employee emp : list) {
            if(emp.getId() == id || emp.getName().equals(name)) {
                return emp;
            }
        }
        return null;
    }

    public List<Employee> getEmployees(Double salary) {
        // display the names of employees who are getting the salary greater than the 60000
        // salary given
        List<Employee> empList = new ArrayList<>();
        for(Employee emp : list) {
            if(emp.getSalary() > salary) {
                empList.add(emp);
            }
        }
        return empList;
    }

    public Double getMaxSalary() {
        // display the max salary
        Double maxSalary = 0.0;
        for(Employee emp : list) {
            if(emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
            }
        }
        return maxSalary;
    }

    public Double getSumOfSalary() {
        // display the sum of salaries of all the employees
        Double sumOfSalary = 0.0;
        for(Employee emp : list) {
            sumOfSalary += emp.getSalary();
        }
        return sumOfSalary;
    }

    public List<String> getNames(String city) {
        // display the names of all employees who are working in 'Pune'
        List<String> nameList = new ArrayList<>();
        for(Employee emp : list) {
            if(emp.getLocation().equalsIgnoreCase(city)) {
                nameList.add(emp.getName());
            }
        }
        return nameList;
    }

    public List<Employee> getDetails() {
        // display all employees based on salary ascending
        List<Employee> empList = new ArrayList<>(list);
        empList.sort((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()));
        return empList;
    }

    public List<Employee> getManagers() {
        // display all employees who are working as managers
        List<Employee> empList = new ArrayList<>();
        for(Employee emp : list) {
            if(emp.getDesignation().equalsIgnoreCase("Manager")) {
                empList.add(emp);
            }
        }
        return empList;
    }

    public Double getSumOfManagerSalaries() {
        // display the sum of salaries of employees who are working as managers
        Double sumOfSalary = 0.0;
        for(Employee emp : list) {
            if(emp.getDesignation().equalsIgnoreCase("Manager")) {
                sumOfSalary += emp.getSalary();
            }
        }
        return sumOfSalary;
    }

    public List<Integer> getIds() {
        // display the ids of all employees
        List<Integer> idList = new ArrayList<>();
        for(Employee emp : list) {
            idList.add(emp.getId());
        }
        return idList;
    }
}
