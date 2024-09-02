package Assignment;

import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to search");
        int num = input.nextInt();
        int count = 0;
        while (num > 0){
            int rem = num % 10;
            if (rem == 5){
                count++;
            }
            num = num / 10;
        }
        System.out.print(count);
    }
}
