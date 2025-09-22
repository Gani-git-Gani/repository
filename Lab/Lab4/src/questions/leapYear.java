package questions;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		 // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Close the Scanner object to prevent resource leaks
        scanner.close();

        // Check if the year is a leap year based on the following conditions:
        // 1. The year is exactly divisible by 4 and not divisible by 100.
        // 2. The year is exactly divisible by 400.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // If the year is a leap year, print a message indicating so
            System.out.println(year + " is a leap year.");
        } else {
            // If the year is not a leap year, print a message indicating so
            System.out.println(year + " is not a leap year.");
        }

	}

}
