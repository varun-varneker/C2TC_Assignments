package com.varun.assignment4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        Integer hours = sc.nextInt();             // Wrapper class Integer
        Double costPerHour = sc.nextDouble();     // Wrapper class Double

        Airfare flight;

        switch (choice) {
            case 1:
                flight = new AirIndia(hours, costPerHour);
                break;
            case 2:
                flight = new KingFisher(hours, costPerHour);
                break;
            case 3:
                flight = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }

        flight.display();
    }
}

