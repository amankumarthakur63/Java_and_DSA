package Recursion;

public class CountZeroes {

    static int Count = 0;
    static int zeroes (int n) {
        if (n == 0) {
            return 1;
        }
        int rem = n % 10;
        if (rem == 0) {
            Count++;
        }
        return Count;
    }
    public static void main(String[] args) {
        System.out.println(zeroes(90003));
    }
}
