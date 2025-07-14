package com.varun.assignment1.utilities;


import com.varun.assignment1.employee.Employee;
import com.varun.assignment1.employee.Developer;
import com.varun.assignment1.employee.Manager;

public class EmployeeUtilities {

	/*Basic Details of Employee*/
	public static void EmployeeDetails(Employee e) {
		System.out.println("Employee Name: "+ e.getName());
		System.out.println("Employee ID: "+ e.getEmployeeId());
		System.out.println("Employee Salary: "+ e.getSalary());
		
		if (e instanceof Manager) {
            Manager m = (Manager) e;
            System.out.println("Dept ID: " + m.getDeptId());
            System.out.println("Department: " + m.getDepartment());
        }

        if(e instanceof Developer) {
        	Developer d = (Developer) e;
        	System.out.println("Programming Languages: "+ d.getProgrammingLanguage());
        	System.out.println("Number of Projects done: "+ d.getProjectsDone());
        }
        
        System.out.println("------------------------------------");
	}
        
        public static boolean isExperiencedDeveloper(Developer d) {
            return d.getProjectsDone() > 5;
        }
        public static boolean isSameDepartment(Manager m1, Manager m2) {
            return m1.getDepartment().equalsIgnoreCase(m2.getDepartment());
        }

        public static String getDeveloperLevel(Developer d) {
            int p = d.getProjectsDone();
            if (p < 3) return "Junior";
            else if (p <= 6) return "Mid";
            else return "Senior";
        }

		
        
	

}
