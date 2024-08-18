package com.aman;

import java.util.Scanner;

public class voteEligibility {
    public static void main(String[] args) {

        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        sc.close();

        if(age < 18){
            System.out.println("You are not Eligible for voting because you are " + age);
        } else {
            System.out.println("You are Eligible for voting ");
        }
    }
}
