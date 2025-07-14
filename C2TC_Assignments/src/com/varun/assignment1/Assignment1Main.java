package com.varun.assignment1;

import com.varun.assignment1.employee.*;
import com.varun.assignment1.utilities.*;

public class Assignment1Main {

	public static void main(String[] args) {
		
		/*Created the values for the attributes and printed the basic information*/
		
		Manager manager1 = new Manager("varun", 101, 100000, 10, "Finance");
		Manager manager2 = new Manager("Mosina", 102, 80000, 11, "Teach");
		Developer dev1 = new Developer("Pradeep", 201, 50000, 8, "Java");
		Developer dev2 = new Developer("Shalini", 202, 25000, 5, "Python");
		
		EmployeeUtilities.EmployeeDetails(manager1);
		EmployeeUtilities.EmployeeDetails(manager2);
		EmployeeUtilities.EmployeeDetails(dev1);
		EmployeeUtilities.EmployeeDetails(dev2);
		
		/*Performed functions using the created utilities*/
		boolean isExperienced = EmployeeUtilities.isExperiencedDeveloper(dev1);
		System.out.println(dev1.getName()+" is experienced? : "+ isExperienced);
		
		boolean isExperienced1 = EmployeeUtilities.isExperiencedDeveloper(dev2);
		System.out.println(dev2.getName()+" is experienced? : "+ isExperienced1);
		
		boolean isSameDepartment = EmployeeUtilities.isSameDepartment(manager1, manager2);
		System.out.println(manager1.getName() +" and "+ manager2.getName() + " are same Department? : " + isSameDepartment);

	}

}
