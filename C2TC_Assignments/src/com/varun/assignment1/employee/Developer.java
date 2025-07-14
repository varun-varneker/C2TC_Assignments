package com.varun.assignment1.employee;


public class Developer extends Employee{
	
	private int projectsDone;
	private String programmingLanguage;
	
	public Developer(String name, int employeeId, int salary, int projectsDone, String programmingLanguage) {
		super(name, employeeId, salary);
		this.projectsDone = projectsDone;
		this.programmingLanguage = programmingLanguage;
	}

	public int getProjectsDone() {
		return projectsDone;
	}

	public void setProjectsDone(int projectsDone) {
		this.projectsDone = projectsDone;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	
}
