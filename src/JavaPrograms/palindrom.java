package JavaPrograms;

import java.util.Scanner;

public class palindrom
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrom(number)){
            System.out.println(number + " is Palindrom");
        }
        else
        {
            System.out.println(number + " is Not Palindrom");
        }
        scanner.close();
    }
    // creating method
    public static boolean isPalindrom(int num){
        if (num < 0){
            return false;
        }
        int original = num;
        int reversed = 0;
        while (num > 0){
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num = num / 10;

        }
        return original == reversed;
    }
}
