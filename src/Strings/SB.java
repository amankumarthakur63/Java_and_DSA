package Strings;

public class StringBuilder {
    public static void main(String[] args) {
        StringBuilders builder = new StringBuilders();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder);
    }
}
