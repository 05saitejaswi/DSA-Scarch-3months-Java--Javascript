import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class CollectionsExerciseTest {

    CollectionsExercise collectionsExercise = new CollectionsExercise();

    @Test
    public void testAddToEndOfLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        collectionsExercise.addToEndOfLinkedList(numbers, 6);
        assertEquals(Integer.valueOf(6), numbers.getLast());
    }

    @Test
    public void testAddToStartOfLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        collectionsExercise.addToStartOfLinkedList(numbers, 0);
        assertEquals(Integer.valueOf(0), numbers.getFirst());
    }

    @Test
    public void testRemoveItemFromTopOfStack() {
        Deque<Integer> stack = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5));
        collectionsExercise.removeItemFromTopOfStack(stack);
        assertEquals(Integer.valueOf(4), stack.peek());
    }

    @Test
    public void testRemoveItemFromTopOfQueue() {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        collectionsExercise.removeItemFromTopOfQueue(queue);
        assertEquals(Integer.valueOf(2), queue.peek());
    }

    @Test
    public void testAddItemToSet() {
        Set<String> set = new HashSet<>(Arrays.asList("a", "b", "c"));
        collectionsExercise.addItemToSet(set, "d");
        assertTrue(set.contains("d"));
    }
}








//CollectionsExcercise.java
public class CollectionsExcercise{
void addToEndOfLinkedList(LinkedList<Integer>numbers,int i){
numbers.add(i);
}
void addToEndOfLinkedList(LinkedList<Integer>numbers,int i){
numbers.addFirst(i);
numbers.add(0,i);
}
void removeItemFromTopOfStack(Deque<Integer> stack){
stack.pop();
}
void removeItemFromTopOfQueue(Queue<Integer> queue){
queue.poll();
}
void addItemFromTopOfSet(Deque<String> item){
set.add(item);
}




  class CollectionsExcerciseTest{
    CollectionsExcer
