package JavaPrograms;

import java.util.Scanner;

// 3. Write a Program to find the Swap two numbers from given number
public class SwapeNumber {
    static void main(String[] args) {
        int x , y , z;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        x = scanner.nextInt();

        System.out.print("Enter 2nd Number: ");
        y = scanner.nextInt();

        // logic to swap numbers
        z = x;
        x = y;
        y = z;


        System.out.println("After Swapping X: "+x);
        System.out.println("After Swapping Y: "+y);
    }
}
