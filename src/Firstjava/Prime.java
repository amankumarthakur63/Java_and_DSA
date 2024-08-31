package Firstjava;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = input.nextInt();
        if (n <= 1) {
            System.out.println("Neither prime nor composite number ");
            return;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("Not prime");
                return;
            }
            c++;
        }
        if (c * c > n) {
            System.out.println("Prime");
        }
    }
}
