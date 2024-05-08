import java.util.Scanner;

class PhonebookManager {
    private ListNode head;

    public PhonebookManager() {
        this.head = null;
    }

    public void addEntryFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        addEntry(name, address, city, phoneNumber);
        scanner.close();
    }

    public void addEntry(String name, String address, String city, String phoneNumber) {
        ListNode newNode = new ListNode(name, address, city, phoneNumber);
        if (head == null || name.compareTo(head.name) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null && name.compareTo(current.next.name) > 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void printEntries() {
        ListNode current = head;
        while (current != null) {
            System.out.println("Name: " + current.name);
            System.out.println("Address: " + current.address);
            System.out.println("City: " + current.city);
            System.out.println("Phone Number: " + current.phoneNumber);
            System.out.println();
            current = current.next;
        }
    }
}