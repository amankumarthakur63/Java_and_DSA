package com.aman;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Principal amount : ");
        float principal = scanner.nextFloat();

        System.out.println("Enter the Rate of Interest : ");
        float rate = scanner.nextFloat();

        System.out.println("Enter the time or month : ");
        float month = scanner.nextFloat();

        float simpleInterest = (principal * rate * month) / 100;
        System.out.println("For " + principal + " the Simple Interest is : " + simpleInterest);
    }
}
