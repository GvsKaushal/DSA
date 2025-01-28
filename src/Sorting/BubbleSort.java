package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        Bsort(array);

        System.out.println(Arrays.toString(array));

    }

    private static void Bsort(int[] array) {

        int n = array.length;

        for (int i = n - 1; i > 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
