package search.linear;

public class linearElement {
    static int linearSearchElement (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,7,34,76,32,65,78,456,43,565,45};
        int target = 43;
        int ans = linearSearchElement(arr,target);
        System.out.println(ans);
    }
}
