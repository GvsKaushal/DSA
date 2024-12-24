package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] array = {17, 3, 25, 12, 9, 42, 81, 67, 53, 19, 7, 38, 59, 2, 47, 63, 85, 11, 34, 56, 78, 90, 23, 4};

        System.out.println(Arrays.toString(array));

        Qsort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    private static void Qsort(int[] array, int left, int right) {

        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            Qsort(array,left,pivotIndex-1);
            Qsort(array,pivotIndex+1,right);
        }
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {

        int swap = pivotIndex;

        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swap++;
                swapValues(array, swap, i);
            }
        }
        swapValues(array, swap, pivotIndex);

        return swap;
    }

    private static void swapValues(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
