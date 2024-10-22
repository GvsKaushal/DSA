package arrays;

import java.util.Arrays;

public class customArray {

    private int[] arr;
    private int size;

    customArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void insertAtEnd(int value) {
        if (size >= arr.length) {
            expandArray();
        }
        arr[size] = value;
        size++;
    }

    public void insertAtFront(int value) {
        if (size >= arr.length) {
            expandArray();
        }

        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = value;
        size++;
    }

    public void insertAtPosition(int value, int position) {

        if (position < 0 || position > size) {
            throw new ArrayIndexOutOfBoundsException("Invalid position");
        }

        if (size >= arr.length) {
            expandArray();
        }

        for (int i = size; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = value;
        size++;
    }

    private void expandArray() {
        arr = Arrays.copyOf(arr, arr.length * 2);
    }

    public void deleteAtEnd() {
        if (size > 0) {
            arr[size - 1] = 0;
            size--;
        } else if (size == 0) {
            System.out.println("Array is empty");
        }

    }

    public void deleteAtFront() {
        if (size > 0) {

            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[size - 1] = 0;
            size--;

        } else if (size == 0) {
            System.out.println("Array is empty");
        }

    }

    public void deleteAtPosition(int position) {
        if (size > 0) {

            if (position < 0 || position >= size) {
                throw new ArrayIndexOutOfBoundsException("Invalid position");
            }

            for (int i = position; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[size - 1] = 0;
            size--;

        } else if (size == 0) {
            System.out.println("Array is empty");
        }

    }

    public void Display(){
        System.out.println("------------------------------------------------------");
        System.out.print("Array : ");
        for (int i =0 ;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("size = "+size+" length = "+arr.length);
        System.out.println("------------------------------------------------------");
    }


}
