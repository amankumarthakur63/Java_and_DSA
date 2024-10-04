package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExmple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(67);
//        list.add(234);
//        list.add(45);
//        list.add(54);
//        list.add(34);
//        System.out.println(list.contains(list));
//        System.out.println(list);
//
//        list.set(0, 99);
//        list.remove(2);
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
