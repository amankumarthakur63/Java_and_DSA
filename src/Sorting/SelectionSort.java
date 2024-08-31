package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex (arr, 0, last);
            swap (arr, maxIndex, last);
        }
    }

    static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

     static int getMaxIndex (int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {45, 43, 54, 23, 48, 87, 56,4, 8, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
