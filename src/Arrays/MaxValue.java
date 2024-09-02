package Arrays;

public class MaxValue {
    static int max (int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] arr = {1, 34, 76, 101, 243, 5, 234};
        System.out.println(max(arr));
    }
}
