package Sorting;

import java.util.Arrays;

public class bubbleSort {
    static void bubbleSortAlgo (int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length -i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {45, 43, 54, 23, 48, 87, 56,4, 8, 9};
        bubbleSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }
}
