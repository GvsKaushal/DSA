package Searching;

import java.util.Arrays;

public class binarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 4, 7, 9, 3, 4, 7, 2, 6, 7, 9, 4, 2, 1, 6, 3};
        int key = 7;

        Arrays.sort(arr);

        int result = BinarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found : " + arr[result] + " at index = " + result);
        }

    }

    private static int BinarySearch(int[] nums, int target) {

        int high = nums.length - 1;
        int low = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int midVal = nums[mid];

            if (target < midVal) {
                high = mid - 1;
            } else if (target > midVal) {
                low = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
