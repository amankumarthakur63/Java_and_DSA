package methods;

//import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime (int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);
        for (int i = 2; i < 1000; i++) {
           if (isPrime(i)) {
               System.out.print(i + " ");
           }
        }
    }
}
