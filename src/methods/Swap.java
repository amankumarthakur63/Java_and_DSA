package methods;

public class Swap {
//    static void swap (int a, int b) {
//       a = a + b;
//        b = a - b;
//        a = a - b;
//        // this is only valid in the functional scope
//
//        int temp = a;
//         a = b;
//         b = a;
         // this will also valid for the functional scope
//    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Swap the variable by three variable
//        int temp = a;
//        a = b;
//        b = temp;

        // Swap the variable by two variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}
