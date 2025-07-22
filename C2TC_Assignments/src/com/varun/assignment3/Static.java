package com.varun.assignment3;

//Static variable and method to track total accounts

public class Static {
 private static int totalAccounts = 0;

 public Static() {
     totalAccounts++;
 }

 public static int getTotalAccounts() {
     return totalAccounts;
 }
}
