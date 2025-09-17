// NAME           	: Anders Gustafson
// GROUP             	: APCS-A
// LAST MODIFIED        : 14 September 2025
// PROBLEM ID           : Lewis Arithmetic 2.2-2.3,
// PROBLEM DESCRIPTION  : Prompt the user for three numbers and
//           		: find the average, sum, and product of the numbers the
//                      : user was prompted for and print the result
// SOURCES I USED       : Java Software Solutions Text
// PEOPLE I HELPED      : Anders Gustafson
// PEOPLE WHO HELPED ME : Anders Gustafson

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
            
            // Find the average of the numbers
            avg = (num1 + num2 + num3) / 3;
            System.out.println("The average is " + avg);
            
            // Find the product of the numbers
            prod = num1 * num2 * num3;
            System.out.println("The product is " + prod );
        }
    }
}

/* 
How many times do you want to run this program?
3

What is the first number
222.2
What is the second number
222.2
What is the third number
222.2

The sum is 666.6
The average is 222.2
The product is 1.0970645E7

What is the first number
3.14159
What is the second number
25.6
What is the third number
17

The sum is 45.741592
The average is 15.247197
The product is 1367.22

What is the first number
100
What is the second number
0
What is the third number
55.5

The sum is 155.5
The average is 51.833332
The product is 0.0 
 */