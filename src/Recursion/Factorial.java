package Recursion;

public class Factorial {

    static int factorial (int n) {
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
