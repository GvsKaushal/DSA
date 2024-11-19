package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {4, 2, 6, 5, 1, 3};
        System.out.println(Arrays.toString(array));

        Isort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void Isort(int[] array) {

        int n = array.length;


        for (int i = 1; i < n; i++) {

            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

}
