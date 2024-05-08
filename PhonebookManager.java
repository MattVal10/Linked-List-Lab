// Matthew Valencia 

// lab 5 Linked List 

// may 7th 

// Youtube,  W3 schools 


import java.util.Scanner;

class PhonebookManager {
    private ListNode head; // Head of the linked list

    public PhonebookManager() {
        this.head = null; // Initialize the head to null
    }

    // Method to add an entry to the phone book from user input
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
        addEntry(name, address, city, phoneNumber); // Add the entry to the phone book
        scanner.close();
    }

    // Method to add an entry to the phone book
    public void addEntry(String name, String address, String city, String phoneNumber) {
        ListNode newNode = new ListNode(name, address, city, phoneNumber); // Create a new ListNode
        if (head == null || name.compareTo(head.name) < 0) { // If the list is empty or the new node should be the new head
            newNode.next = head; // Set the new node's next to the current head
            head = newNode; // Update the head to the new node
        } else {
            ListNode current = head;
            // Find the correct position to insert the new node
            while (current.next != null && name.compareTo(current.next.name) > 0) {
                current = current.next;
            }
            newNode.next = current.next; // Set the new node's next to the current node's next
            current.next = newNode; // Set the current node's next to the new node
        }
    }

    // Method to print all entries in the phone book
    public void printEntries() {
        ListNode current = head; // Start from the head
        while (current != null) { // Iterate through the list
            // Print the details of the current node
            System.out.println("Name: " + current.name);
            System.out.println("Address: " + current.address);
            System.out.println("City: " + current.city);
            System.out.println("Phone Number: " + current.phoneNumber);
            System.out.println();
            current = current.next; // Move to the next node
        }
    }
}