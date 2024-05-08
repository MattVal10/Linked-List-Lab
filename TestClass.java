// Matthew Valencia 

// lab 5 Linked List 

// may 7th 

// Youtube,  W3 schools 



public class TestClass {
    public static void main(String[] args) {
        // Create a new PhonebookManager instance
        PhonebookManager manager = new PhonebookManager();
        
        // Add some initial entries
        manager.addEntry("John Doe", "123 Main St", "Bellingham", "555-1234");
        manager.addEntry("Jane Smith", "456 Elm St", "Seattle", "555-5678");
        manager.addEntry("Alice Johnson", "789 Oak St", "Bellingham", "555-9012");
        
        // Add an entry from user input
        manager.addEntryFromUserInput();
        
        System.out.println();
        
        // Print all entries in the phone book
        manager.printEntries();
    }
}
