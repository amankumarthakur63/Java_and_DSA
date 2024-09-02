package Arrays;

import java.util.Arrays;

public class PassingOfFunction {
    static void change (int[] arr) {
        arr[0] = 99;
        arr[5] = 43;
    }
    public static void main(String[] args) {
        int[] arr = {1, 34, 76, 101, 243, 5, 234};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
}
