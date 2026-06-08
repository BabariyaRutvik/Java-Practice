package JavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber
{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)){
            System.out.println(number + " is an Armstrong");
        }
        else {
            System.out.println(number + " is Not an Armstrong");
        }
    }
    public static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;

        // calculating the number of digits
        int digits = String.valueOf(num).length();

        int temp = num;
        while (temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;

        }
        return  sum == original;
    }
}
