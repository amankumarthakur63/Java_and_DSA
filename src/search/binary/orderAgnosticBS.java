package search.binary;

public class orderAgnosticBS {

    static int agnosticBS (int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAgnostic = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == mid) {
                return mid;
            }

            if (isAgnostic) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {48, 30, 20, 19, 18, 16, 14, 13, 12, 11, 9, 5, 3, 1};
        int target = 3;
        int ans = agnosticBS(arr, target);
        System.out.println(ans);
    }
}
