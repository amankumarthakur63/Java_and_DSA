package Assignment;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter the operator : ");
            char op = scanner.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter the Numbers : ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if (num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if(op == '%') {
                    ans = num1 % num2;
                }
                } else if(op == 'x' || op == 'X'){
                    break;
                } else {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }
    }
}
