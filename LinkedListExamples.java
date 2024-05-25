import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // ArrayList is quicker for randomly accessing elements
        // LinkedList is quicker for adding and deleting elements from the list
        // LinkedList comes with some methods like addFirst, addLast, removeFirst, removeLast
        
        // Created the LinkedList and started adding items using the .add method
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        System.out.println(shoppingList); 

        // Add method call with index and element, it updates the list
        shoppingList.add(1, "mango");
        System.out.println(shoppingList);

        // Removing the first element
        shoppingList.removeFirst();
        System.out.println(shoppingList); 

        // Removing the last element
        shoppingList.removeLast();
        System.out.println(shoppingList);

        // Adding element to the end of the list
        shoppingList.addLast("grape");
        System.out.println(shoppingList); 

        // Adding element to the start of the list
        shoppingList.addFirst("pineapple");
        System.out.println(shoppingList);

        // Making the list synchronized, copy the list 
        List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
        System.out.println(synchronizedShoppingList);
    }
}
