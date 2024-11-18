package LinkedList;

import java.util.Scanner;

public class LL {
    public static void main(String[] args) {

        Linkedlist linkedlist = new Linkedlist();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.Append");
            System.out.println("2.RemoveLast");
            System.out.println("3.Prepend");
            System.out.println("4.RemoveFirst");
            System.out.println("5.Insert");
            System.out.println("6.Remove");
            System.out.println("7.Set");
            System.out.println("8.display");
            System.out.println("9.exit");

            System.out.print("Enter you choice = ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to append: ");
                    int appendValue = scanner.nextInt();
                    linkedlist.Append(appendValue);
                    linkedlist.display();
                    break;
                case 2:
                    Node removedLast = linkedlist.RemoveLast();
                    if (removedLast == null) {
                        System.out.println("linkedlist is empty");
                    } else {
                        System.out.println("last node Removed " + removedLast.value);
                    }
                    linkedlist.display();
                    break;
                case 3:
                    System.out.print("Enter value to prepend: ");
                    int prependValue = scanner.nextInt();
                    linkedlist.Prepend(prependValue);
                    linkedlist.display();
                    break;
                case 4:
                    Node removedFirst = linkedlist.RemoveFirst();
                    if (removedFirst == null) {
                        System.out.println("linkedlist is empty");
                    } else {
                        System.out.println("first node Removed " + removedFirst.value);
                    }
                    linkedlist.display();
                    break;
                case 5:
                    System.out.print("Enter index to insert: ");
                    int insertIndex = scanner.nextInt();
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    boolean inserted = linkedlist.Insert(insertIndex, insertValue);
                    System.out.println("Insert " + (inserted ? "successful" : "failed"));
                    linkedlist.display();
                    break;
                case 6:
                    System.out.print("Enter index to remove: ");
                    int removeIndex = scanner.nextInt();
                    Node removedNode = linkedlist.Remove(removeIndex);
                    if (removedNode == null) {
                        System.out.println("check the index");
                    } else {
                        System.out.println("node Removed " + removedNode.value);
                    }
                    linkedlist.display();
                    break;
                case 7:
                    System.out.print("Enter index to set: ");
                    int setIndex = scanner.nextInt();
                    System.out.print("Enter new value: ");
                    int setValue = scanner.nextInt();
                    boolean set = linkedlist.Set(setIndex, setValue);
                    System.out.println("update " + (set ? "successful" : "failed"));
                    linkedlist.display();
                    break;
                case 8:
                    linkedlist.display();
                    break;
                case 9:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid operation.");
            }

        }

    }
}