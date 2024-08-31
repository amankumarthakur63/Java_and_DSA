package Recursion;

public class PrintNumber {

    static void printNumber (int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumber(n + 1);
    }
    public static void main(String[] args) {
        printNumber(1);

    }
}
