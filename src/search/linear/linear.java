package search.linear;

public class linear {
    static boolean linearSearch (int[] arr , int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,35,6,7, 67,7,567,758,46};
        int target = 776;
        boolean ans = linearSearch(arr, target);
        System.out.println(ans);
    }
}
