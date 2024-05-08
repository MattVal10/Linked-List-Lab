public class TestClass {
    public static void main(String[] args) {
        PhonebookManager manager = new PhonebookManager();
        manager.addEntry("John Doe", "123 Main St", "Bellingham", "555-1234");
        manager.addEntry("Jane Smith", "456 Elm St", "Seattle", "555-5678");
        manager.addEntry("Alice Johnson", "789 Oak St", "Bellingham", "555-9012");
        manager.addEntryFromUserInput();
        System.out.println();
        manager.printEntries();
    }
}
