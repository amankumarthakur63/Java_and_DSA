package com.aman;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number which you want to check whether odd or even : ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is an even number.");
        } else{
            System.out.println(number + " is an odd number. ");
        }
    }
}
