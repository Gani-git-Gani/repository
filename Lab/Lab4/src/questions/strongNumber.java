package questions;

import java.util.Scanner;

public class strongNumber {

	public static void main(String[] args) {
		// Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Close the Scanner object to prevent resource leaks
        scanner.close();

        // Check if the number is a Strong number and print the result
        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is not a Strong number.");
        }
    }

    // Method to check if a number is a Strong number
    public static boolean isStrongNumber(int num) {
        // Store the original number for later comparison
        int originalNum = num;

        // Initialize a variable to store the sum of factorials of digits
        int sum = 0;

        // Loop through each digit of the number
        while (num > 0) {
            // Extract the last digit of the number
            int digit = num % 10;

            // Calculate the factorial of the digit and add it to the sum
            sum += factorial(digit);

            // Remove the last digit from the number
            num /= 10;
        }

        // Return true if the sum of factorials equals the original number
        return sum == originalNum;
    }

    // Method to calculate the factorial of a number
    public static int factorial(int n) {
        // Initialize a variable to store the factorial result
        int fact = 1;

        // Calculate the factorial using a loop
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        // Return the calculated factorial
        return fact;


	}

}
