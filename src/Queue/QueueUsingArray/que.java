package Queue.QueueUsingArray;

import java.util.Scanner;

public class que {
    public static void main(String[] args) {

        QueueArray q = new QueueArray(2);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.show");
            System.out.println("4.Exit");


            System.out.print("Enter you choice = ");
            int choice = sc.nextInt();


            switch (choice) {
                case 1:

                    System.out.print("Enter a number to push : ");
                    int value = sc.nextInt();
                    q.Enqueue(value);
                    q.show();

                    break;
                case 2:

                    q.Dequeue();
                    q.show();
                    break;

                case 3:

                    q.show();
                    break;

                case 4:
                    System.out.println("Exit");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Enter numbers between 1 - 4");
            }
        }


    }
}
