package Conditions_loops;

import java.util.Scanner;

public class If_elseif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary please : ");
        long salary = input.nextLong();
        if (salary >= 100000) {
            System.out.println(salary += 10000);
        } else {
            System.out.println(salary += 1000);
        }
    }
}
