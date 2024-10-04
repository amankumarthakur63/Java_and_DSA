package Recursion.Sorting;

import java.util.Arrays;

public class QuickSort {

    static void sort (int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];
        while (nums[start] < pivot) {
            start++;
        }
        while (nums[end] > pivot) {
            end--;
        }
        if (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        sort(nums, low, end);
        sort(nums, start, high);
    }
    public static void main(String[] args) {
        int[] nums = {3, 8, 4, 6, 9, 1, 2};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
