package com.cg.demo;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	private String designation;
	private String location;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, Double salary, String designation, String location) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.location = location;
	}

	// generate setters, getters and toString

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", location=" + location + "]";
	}

}
