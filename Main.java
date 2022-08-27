import DSA.queue.*;
import DSA.stack.*;

public class Main {
    
    public static void main(String[] args){
        // QueueWithLinkedList llQueue = new QueueWithLinkedList();
        // QueueWithResizingArray arrQueue = new QueueWithResizingArray();
        // llQueue.enqueue("to");
        // llQueue.enqueue("be");
        // llQueue.enqueue("not");
        // System.out.println(llQueue.dequeue());


        // arrQueue.enqueue("to");
        // arrQueue.enqueue("be");
        // arrQueue.enqueue("not");
        // System.out.println(arrQueue.dequeue());
        // System.out.println(arrQueue.dequeue());
        // System.out.println(arrQueue.dequeue());
        // System.out.println(arrQueue.dequeue());

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
    }
}
