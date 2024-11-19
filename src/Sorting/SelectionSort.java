package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {4, 2, 6, 5, 1, 3};
        System.out.println(Arrays.toString(array));

        Ssort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void Ssort(int[] array) {

        int n = array.length;


        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
