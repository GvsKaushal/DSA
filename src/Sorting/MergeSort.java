package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {17, 3, 25, 12, 9, 42, 81, 67, 53, 19, 7, 38, 59, 2, 47, 63, 85, 11, 34, 56, 78, 90, 23, 4};

        System.out.println(Arrays.toString(array));

        int[] result = Msort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(result));
    }

    private static int[] Msort(int[] array, int left, int right) {

        if (left == right) return new int[]{array[left]};

        int mid = left + (right - left) / 2;

        int[] leftArray = Msort(array, left, mid);
        int[] rightArray = Msort(array, mid + 1, right);

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
