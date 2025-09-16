/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Initialize the variables
        float num1, num2, num3, avg, sum, prod;

        // Prompt for number of runs
        System.out.println("How many times do you want to run this program?");
        int numRuns = scanner.nextInt();

        // Begin for loop for main code
        for(int i = 0; i < numRuns; i++)
        {
            // Input first number
            System.out.println("What is the first number");
            num1 = scanner.nextFloat();

            // Input second number
            System.out.println("What is the second number");
            num2 = scanner.nextFloat();

            // Input third number
            System.out.println("What is the third number");
            num3 = scanner.nextFloat();

            // Find the sum of the numbers
            sum = (num1 + num2 + num3);
            System.out.println("The sum is " + sum);

            // Find the product of the numbers
            prod = num1 * num2 * num3;
            System.out.println("The product is " + prod );
            
            // Find the average of the numbers
            avg = (num1 + num2 + num3) / 3;
            System.out.println("The average is " + avg);
        }
    }
}
