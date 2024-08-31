package Firstjava;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Number : ");
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();

        float sum = number1 + number2;
        System.out.println("Sum : " + sum);
    }
}
