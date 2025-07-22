package com.varun.assignment3;

//Final class and final method for secure transactions

public final class Final {
 public final double transactionFee = 10.0;

 public final void performTransaction(Account acc, String type, double amount) {
     System.out.println("--- Transaction Start ---");

     if (type.equalsIgnoreCase("deposit")) {
         acc.deposit(amount);
     } else if (type.equalsIgnoreCase("withdraw")) {
         acc.withdraw(amount + transactionFee);
         System.out.println("₹" + transactionFee + " transaction fee applied.");
     } else {
         System.out.println("Invalid transaction type.");
     }

     System.out.println("Current Balance: ₹" + acc.getBalance());
     System.out.println("--- Transaction End ---\n");
 }
}
