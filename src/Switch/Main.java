package Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();
//
//        switch (fruit) {
//            case "Mango" :
//                System.out.println("King of fruit");
//                break;
//            case "Apple" :
//                System.out.println("A sweet red fruit");
//                break;
//            case "Oranges" :
//                System.out.println("Round fruit");
//                break;
//            case "Grapes" :
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
//        }

        int day = input.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Please enter a valid day");
        }
    }
}
