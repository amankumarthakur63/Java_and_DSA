package Strings;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1);
        System.out.println("Aman" + new ArrayList<>());
        System.out.println("Aman" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
        System.out.println("a" + 'b');
    }
}
