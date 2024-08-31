package Assignment;

import java.util.Scanner;

public class greetingName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Good Morning, " + name + " . Have a nice day");
    }
}
