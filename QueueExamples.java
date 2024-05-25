import java.util.ArrayDeque;
import  java.util.Queue;
public class QueueExamples{
  public static void main(String[] args){
    public static void main(String[] args){
        //even in place of ArrayDeque is same as linked list (que=linkedlist=prioity que(almost same retriving order chnages accordingly))
        Queue<String> queue=new ArrayDeque<>();
        queue.offer("person one");
        queue.offer("person two");
        queue.offer("person three");
        System.out.println(queue);
        System.out.println(queue.peek());
        //here we are sdaying to print remaning queueafter we remove that
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.poll());
    }
  }
}

// output:
// [person one, person two, person three]
// person one
// [person two, person three]
// person two
