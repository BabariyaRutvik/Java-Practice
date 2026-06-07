package JavaPrograms;

import java.util.Scanner;

// 2. Write a Program to find the Positive negative number from the given number
public class Positive_Negative {
    static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        number = scanner.nextInt();

        if (number > 0){
            System.out.println(number + " Positive Number");
        } else if (number < 0) {
            System.out.println(number + " Negative Number");
        }
        else {
            System.out.println(number + " Zero");
        }
    }
}
