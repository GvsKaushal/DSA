package Stack.StackUsingLinkedlist;

import java.util.Scanner;

public class sta {

    public static void main(String[] args) {

        stackLinkedList s=new stackLinkedList();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.show");
            System.out.println("5.Exit");


            System.out.print("Enter you choice = ");
            int choice = sc.nextInt();


            switch (choice) {
                case 1:

                    System.out.print("Enter a number to push : ");
                    int value = sc.nextInt();
                    s.push(value);
                    s.show();

                    break;
                case 2:

                    s.pop();
                    s.show();

                    break;
                case 3:

                    s.peek();

                    break;
                case 4:

                    s.show();
                    break;

                case 5:
                    System.out.println("Exit");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Enter numbers between 1 - 5");
            }
        }
    }
}
