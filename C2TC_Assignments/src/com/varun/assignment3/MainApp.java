package com.varun.assignment3;

//Driver code

public class MainApp {
 public static void main(String[] args) {
     // Create bank accounts (track using Static)
     Static acc1 = new Static();
     Static acc2 = new Static();

     // Create Account instances
     SavingsAccount sAcc = new SavingsAccount("Varun", 5000);
     CheckingAccount cAcc = new CheckingAccount("Mosina", 10000);

     // Use Final class for transactions
     Final tx = new Final();
     tx.performTransaction(sAcc, "deposit", 1000);
     tx.performTransaction(sAcc, "withdraw", 2000);
     tx.performTransaction(cAcc, "withdraw", 3000);

     // Total accounts tracked using Static class
     System.out.println("Total Bank Accounts Created: " + Static.getTotalAccounts());
 }
}

