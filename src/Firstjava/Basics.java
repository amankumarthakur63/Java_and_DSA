package Firstjava;

public class Basics {
    public static void main(String[] args) {
        int a = 10;
        if (a == 10) {
            System.out.println("Hello World");
        } else {
            int count = 1;
            while (count != 5) {
                System.out.println(count);
                count++;
            }
        }
        // Use for loop to run iteration
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
    }
}
