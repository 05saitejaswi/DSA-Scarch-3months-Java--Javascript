import java.util.ArrayDeque;
import java.util.Deque;

public class StackExamples{
    public static void main(String[] args){
        //deque is not thread safe
        Deque<String> stack=new ArrayDeque<>();
        stack.push("First Request");
        stack.push("second Request");
        stack.push("Thrid Request");
        System.out.println(stack);
        //peek() get the first element
        System.out.println(stack.peek());
         //pop out the element
        System.out.println(stack.pop());
        stack.pop();
        System.out.println(stack);
        stack.poll();
        System.out.println(stack);    
    }
}


// output:
// [Thrid Request, second Request, First Request]
// Thrid Request
// Thrid Request
// [First Request]
// []
