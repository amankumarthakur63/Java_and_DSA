package methods;

public class ArmstrongNumber {
//  To print all the Armstrong number

    static boolean isArmstrong (int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
