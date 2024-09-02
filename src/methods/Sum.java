package methods;

import java.util.Scanner;

public class Sum {

    static void sum () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum " + sum);
    }

    static int sum2 () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();
        int plus = num1 + num2;
        return plus;
    }

    static int sum3 (int a, int b) {
        int add = a + b;
        return add;
    }
    public static void main(String[] args) {
        //sum();
        //System.out.println("Sum : " + sum2());
        System.out.println(sum3(89,45));
    }
}
