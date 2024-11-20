package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {17, 3, 25, 12, 9, 42, 81, 67, 53, 19, 7, 38, 59, 2, 47, 63, 85, 11, 34, 56, 78, 90, 23, 4};

        System.out.println(Arrays.toString(array));

        int[] result = Msort(array);

        System.out.println(Arrays.toString(result));
    }

    private static int[] Msort(int[] array) {

        if (array.length == 1) return array;

        int left = 0;
        int right = array.length;

        int mid = (left + right) / 2;

        int[] leftArray = Msort(Arrays.copyOfRange(array, left, mid));
        int[] rightArray = Msort(Arrays.copyOfRange(array, mid, right));

        return merge(leftArray, rightArray);

    }

    private static int[] merge(int[] a, int[] b) {

        int len1 = a.length;
        int len2 = b.length;

        int[] array = new int[len1 + len2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < len1 && j < len2) {

            if (a[i] < b[j]) {
                array[k] = a[i];
                k++;
                i++;
            } else {
                array[k] = b[j];
                k++;
                j++;
            }
        }

        while (i < len1) {

            array[k] = a[i];
            k++;
            i++;
        }

        while (j < len2) {

            array[k] = b[j];
            k++;
            j++;
        }

        return array;
    }
}
