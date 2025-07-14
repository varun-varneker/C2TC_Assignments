package com.varun.assignment1.employee;


/* created a Employee class with the respective attributes */
public class Employee {
	public String name;
	private int employeeId;
	protected int salary;
	
	
/* created the parametric constructor */	
	public Employee(String name, int employeeId, int salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

/* created getters and setters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	
	

}
