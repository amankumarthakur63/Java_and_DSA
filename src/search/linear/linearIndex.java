package search.linear;

public class linearIndex {
    static  int linearSearchIndex (int[] arr, int target) {
        if (target == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length ; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {45,34,45,7,6,764,5,5,46,45,45,76,3};
        int target = 3;
        int ans = linearSearchIndex(arr, target);
        System.out.println(ans);
    }
}
