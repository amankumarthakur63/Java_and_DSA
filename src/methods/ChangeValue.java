package methods;

import java.util.Arrays;

public class ChangeValue {

    static void change (int[] arr) {
        arr[0] = 99;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 87, 88};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
}
