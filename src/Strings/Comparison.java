package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Aman";
        String b = "Kumar";
        String c = a;
        System.out.println(c == a);
        System.out.println(a == b);

        String name1 = new String("Aman");
        String name2 = new String("Kumar");
        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));
    }
}
