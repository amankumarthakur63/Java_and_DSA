package Firstjava;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num1 = input.nextFloat();
//        int num2 = input.nextInt();
//
//        System.out.println(num1);
//        System.out.println(num2);

        // Type Casting
//        int num = (int) (67.56f);
//        System.out.println(num);

        // Automatic type promotion in expression
//        int a = 257;
//        byte b = (byte) (a);
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d  = a * b / c;
//        System.out.println(d);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.12345;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " + (i / c) + " "+ (d * s));
        System.out.println(result);

    }
}
