package methods;

import java.util.Arrays;

public class VarArgs {

    static void demo (int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo2 (String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun (int ...v){
        System.out.println(Arrays.toString(v));
    }

    
    public static void main(String[] args) {
        demo(32, 33, 16);
        demo2("Aman Kumar", "Aman Raj", "Adarsh");
        fun();
    }
}
