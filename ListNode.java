// Matthew Valencia 

// lab 5 Linked List 

// may 7th 

// Youtube,  W3 schools 


class ListNode {
    String name;
    String address;
    String city;
    String phoneNumber;
    ListNode next; // Reference to the next node

    // Constructor to initialize the node
    public ListNode(String name, String address, String city, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null; // Initialize the next reference to null
    }
}