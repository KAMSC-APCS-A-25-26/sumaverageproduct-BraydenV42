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
        double num1, num2, num3;
        double averages, sums, products;

        // Prompt for number of runs
        int n = scanner.nextInt();

        // Begin for loop for main code
        for(int i = 0; i < n; i++)
        {
            // Input numbers
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            num3 = scanner.nextDouble();
            
            System.out.println("Your output was:");
            // Find the sum of the numbers
            sum = (num1 + num2 + num3);
            System.out.println("Sum: " + sums);

            // Find the product of the numbers
            prod = num1 * num2 * num3;
            System.out.println("Product: " + products);

            // Find the average of the numbers
            avg = (num1 + num2 + num3) / n;
            System.out.println("Average: " + averages);
        }
    }
}
