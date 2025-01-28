package arrays;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int capacity = 4;
        customArray array = new customArray(capacity);


        while (true) {
            System.out.println("1.insertAtEnd");
            System.out.println("2.insertAtFront");
            System.out.println("3.insertAtPosition");
            System.out.println("4.deleteAtEnd");
            System.out.println("5.deleteAtFront");
            System.out.println("6.deleteAtPosition");
            System.out.println("7.display");
            System.out.println("8.Exit");


            System.out.print("Enter you choice = ");
            int choice = sc.nextInt();


            switch (choice) {
                case 1:

                    System.out.print("Enter a number to insert : ");
                    int value = sc.nextInt();
                    array.insertAtEnd(value);
                    array.Display();

                    break;
                case 2:

                    System.out.print("Enter a number to insert : ");
                    int value1 = sc.nextInt();
                    array.insertAtFront(value1);
                    array.Display();

                    break;
                case 3:

                    System.out.print("Enter a number to insert : ");
                    int value2 = sc.nextInt();
                    System.out.print("Enter Index position : ");
                    int position = sc.nextInt();
                    array.insertAtPosition(value2, position);
                    array.Display();

                    break;
                case 4:
                    array.deleteAtEnd();
                    array.Display();
                    break;
                case 5:
                    array.deleteAtFront();
                    array.Display();
                    break;
                case 6:

                    System.out.print("Enter Index position : ");
                    int position1 = sc.nextInt();
                    array.deleteAtPosition(position1);
                    array.Display();

                    break;
                case 7:
                    array.Display();
                    break;
                case 8:
                    System.out.println("Exit");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Enter numbers between 1 - 8");
            }
        }
    }
}
