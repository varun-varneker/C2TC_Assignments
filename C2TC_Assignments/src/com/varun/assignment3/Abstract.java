package com.varun.assignment3;

//Abstract class and subclasses

abstract class Account {
 protected String accHolder;
 protected double balance;

 Account(String accHolder, double balance) {
     this.accHolder = accHolder;
     this.balance = balance;
 }

 abstract void deposit(double amount);
 abstract void withdraw(double amount);
 abstract double getBalance();

 public void display() {
     System.out.println("Account Holder: " + accHolder);
     System.out.println("Balance: ₹" + balance);
 }
}

class SavingsAccount extends Account {
 public SavingsAccount(String accHolder, double balance) {
     super(accHolder, balance);
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("₹" + amount + " deposited in Savings Account.");
 }

 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("₹" + amount + " withdrawn from Savings Account.");
     } else {
         System.out.println("Insufficient balance.");
     }
 }

 public double getBalance() {
     return balance;
 }
}

class CheckingAccount extends Account {
 public CheckingAccount(String accHolder, double balance) {
     super(accHolder, balance);
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("₹" + amount + " deposited in Checking Account.");
 }

 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("₹" + amount + " withdrawn from Checking Account.");
     } else {
         System.out.println("Insufficient balance.");
     }
 }

 public double getBalance() {
     return balance;
 }
}
