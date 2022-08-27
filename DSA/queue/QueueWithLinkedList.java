package DSA.queue;

public class QueueWithLinkedList {
    
    private Node first, last =  null;

    private class Node {
        String text;
        Node next;
    }
    
    /**
    *  @description - method the chech whether the queue is empty 
    *  @param -  
    *  @returns -  
    */
    public boolean isEmpty(){
        return first == null;
    }

    /**
    *  @description - adds a new element to the queue 
    *  @param - item to be added
    *  @returns -  
    */
    public void enqueue(String item){
        Node oldlast = last;
        last = new Node();
        last.text = item;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else {
            oldlast.next = last;
        }
    }

    /**
    *  @description - removes an element from the queue 
    *  @param -  
    *  @returns -  
    */
    public String dequeue(){
        if(isEmpty()){
            last = null;
            return null;
        } else {
            String item = first.text;
            first = first.next;
            return item;
        }
    }

}
