package com.varun.assignment1.employee;

public class Manager extends Employee {

/*Added additional attributes*/
	private String department;
	private int deptId;
    
	
/*created a constructor by calling the superclass constructor*/
	public Manager(String name, int employeeId, int salary, int deptId, String department) {
        super(name, employeeId, salary);  // Call to Employee constructor
        this.deptId = deptId;
        this.department = department;
}
	
/*Created getters and setters*/
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
    
}