package JavaPrograms;

import java.util.Scanner;

// 1. Write a Prograam to find the Odd Even number from the user entered
public class OddEven
{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("EnterAny Number: ");
        number = scanner.nextInt();

        if ( number % 2 == 0){
            System.out.println(number + " Even Number");
        }
        else {
            System.out.println(number + " Odd Number");
        }
    }
}
