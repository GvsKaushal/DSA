package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        customArray array = null;
        int capacity=0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Enter size of array");
            try {
                capacity = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.next();
            }
        }
        array = new customArray(capacity);

        while (true) {
            System.out.println("1.insertAtEnd");
            System.out.println("2.insertAtFront");
            System.out.println("3.insertAtPosition");
            System.out.println("4.deleteAtEnd");
            System.out.println("5.deleteAtFront");
            System.out.println("6.deleteAtPosition");
            System.out.println("7.display");
            System.out.println("8.Exit");


            int choice=0;
            boolean validInput1 = false;

            while (!validInput1) {
                System.out.print("Enter you choice = ");
                try {
                    choice = sc.nextInt();
                    validInput1 = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    sc.next();
                }
            }

            switch (choice){
                case 1:
                    try {
                        System.out.print("Enter a number to insert : ");
                        int value= sc.nextInt();
                        array.insertAtEnd(value);
                        array.Display();
                    } catch (Exception e) {
                        System.out.println("Enter only numbers");
                        sc.next();
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Enter a number to insert : ");
                        int value= sc.nextInt();
                        array.insertAtFront(value);
                        array.Display();
                    } catch (Exception e) {
                        System.out.println("Enter only numbers");
                        sc.next();
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Enter a number to insert : ");
                        int value= sc.nextInt();
                        System.out.print("Enter Index position : ");
                        int position= sc.nextInt();
                        array.insertAtPosition(value,position);
                        array.Display();
                    } catch (Exception e) {
                        System.out.println("Enter only numbers");
                        sc.next();
                    }
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
                    try {
                        System.out.print("Enter Index position : ");
                        int position= sc.nextInt();
                        array.deleteAtPosition(position);
                        array.Display();
                    } catch (Exception e) {
                        System.out.println("Enter only numbers");
                        sc.next();
                    }
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
