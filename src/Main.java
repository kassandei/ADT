import List.ListLC;
import Stack.StackV;

public class Main {
    public static void main(String[] args) {
        ListLC myList = new ListLC();
        myList.insert("Hello");
        myList.insert("World");
        myList.insert("!");

        System.out.println("List: " + myList);

        myList.moveNext(); // Move cursor to "Hello"
        myList.moveNext(); // Move cursor to "World"

        System.out.println("Extracted: " + myList.extract()); // Should extract "World"
        System.out.println("List after extraction: " + myList);
    }
}