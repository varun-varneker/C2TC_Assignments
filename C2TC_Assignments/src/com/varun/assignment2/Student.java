package com.varun.assignment2;

import java.util.Scanner;

//Part 1: Student class with default constructor
class Student1 {
 Student1() {
     System.out.println("Student object is created");
 }
}

//Part 2: Commission class
class Commission {
 // Data Members
 String name, address;
 String phone;
 double salesAmount;

 // Method to accept details
 void acceptDetails() {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Name: ");
     name = sc.nextLine();

     System.out.print("Enter Address: ");
     address = sc.nextLine();

     System.out.print("Enter Phone: ");
     phone = sc.nextLine();

     System.out.print("Enter Sales Amount: ");
     salesAmount = sc.nextDouble();
 }

 // Method to calculate and print commission
 void calculateCommission() {
     double commission;
     if (salesAmount >= 100000) {
         commission = 0.10 * salesAmount;
     } else if (salesAmount >= 50000) {
         commission = 0.05 * salesAmount;
     } else if (salesAmount >= 30000) {
         commission = 0.03 * salesAmount;
     } else {
         commission = 0;
     }

     System.out.println("Commission for " + name + ": ₹" + commission);
 }
}

//Main class
public class Student {
 public static void main(String[] args) {
     // Student object
     Student s = new Student();

     // Commission object
     Commission c = new Commission();
     c.acceptDetails();
     c.calculateCommission();
 }
}
