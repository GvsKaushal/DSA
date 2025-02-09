package Heaps.MaxHeap;

import java.util.Arrays;
import java.util.Scanner;

public class max {

    public static void main(String[] args) {

        MaximumHeap maxHeap = new MaximumHeap(2);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMax Heap Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Print Heap");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    maxHeap.insert(value);
                    System.out.println("Max Heap: " + Arrays.toString(maxHeap.getHeap()));
                    break;
                case 2:
                    Integer removed = maxHeap.remove();
                    if (removed != null) {
                        System.out.println("Removed: " + removed);
                        System.out.println("Max Heap: " + Arrays.toString(maxHeap.getHeap()));
                    } else {
                        System.out.println("Heap is empty.");
                    }
                    break;
                case 3:
                    System.out.println("Max Heap: " + Arrays.toString(maxHeap.getHeap()));
                    break;
                case 4:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}
