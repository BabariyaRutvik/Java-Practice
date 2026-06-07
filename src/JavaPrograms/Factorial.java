package JavaPrograms;

import java.util.Scanner;

// 4. Write a Program to find the factorial of a given number.
public class Factorial
{
    public static void main(String[] args) {
        int number;
        int fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        int i = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial is: " + fact);
        sc.close();
    }
}
