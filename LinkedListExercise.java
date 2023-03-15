import java.util.Scanner;

public class LinkedListExercise {
    public static void main(String[] args) {
        /*
        linkedList<Integer> lList = new linkedList<>();
        lList.add(3);
        lList.add(2);
        lList.add(8);
        lList.println();
        lList.deleteNode(2);
        lList.println();
        lList.deleteAll();
        lList.add(5);
        lList.add(10);
        lList.add(7);
        lList.add(30);

        int sum = 0;
        LinkedListNode<Integer> nodeRef = lList.head;
        while (nodeRef != null){
            int next = nodeRef.data;
            sum += next;
            nodeRef = nodeRef.next;
        }
        System.out.print(sum);

         */

        linkedList<Contact> ContactBook = new linkedList<>();
        LinkedListNode<Contact> node;
        String name, email;
        boolean flag = true;

        while (flag) {
            Scanner input = new Scanner(System.in);
            System.out.println("****************************************************************************************");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("****************************************************************************************");
            System.out.print("Please enter a command: ");
            String selection = input.nextLine();
            switch (selection) {
                case "A" -> {
                    Contact temp = new Contact();
                    System.out.print("Enter name: ");
                    temp.name = input.nextLine();
                    System.out.print("Enter email address: ");
                    temp.email = input.nextLine();
                    System.out.print("Enter phone number: ");
                    temp.phone = input.nextLine();
                    ContactBook.add(temp);
                    System.out.println();
                }

                case "D" -> {
                    System.out.print("Enter name of contact to delete: ");
                    name = input.nextLine();
                    node = ContactBook.head;
                    while ((node != null) && (!node.data.name.equals(name))) {
                        node = node.next;
                    }
                    if (node != null) {
                        ContactBook.deleteNode(node.data);
                        System.out.println("Contact deleted");
                    } else {
                        System.out.println("Contact not found");
                    }
                    System.out.println();
                }

                case "E" -> {
                    System.out.print("Enter email of contact to find: ");
                    email = input.nextLine();
                    node = ContactBook.head;
                    while ((node != null) && (!node.data.email.equals(email))) {
                        node = node.next;
                    }
                    if (node != null) {
                        System.out.println("Contact found: ");
                        node.data.print("   ");
                    } else {
                        System.out.println("Contact not found");
                    }
                    System.out.println();
                }

                case "P" -> {
                    node = ContactBook.head;
                    while ((node != null)) {
                        node.data.print("");
                        System.out.println();
                        node = node.next;
                    }
                }

                case "S" -> {
                    System.out.print("Enter email of contact to find: ");
                    name = input.nextLine();
                    node = ContactBook.head;
                    while ((node != null) && (!node.data.name.equals(name))) {
                        node = node.next;
                    }
                    if (node != null) {
                        System.out.println("Contact found: ");
                        node.data.print("   ");
                    } else {
                        System.out.println("Contact not found");
                    }
                    System.out.println();
                }

                case "Q" -> {
                    flag = false;
                    System.out.println();
                }

                default -> {
                    System.out.println("Unknown entry");
                    System.out.println();
                }
            }
        }
    }
}

class Contact{
    String name, phone, email;

    public void print(String indent){
        System.out.println(indent + "Name: " + name);
        System.out.println(indent + "Email: " + email);
        System.out.println(indent + "Phone number: " + phone);
    }


}

