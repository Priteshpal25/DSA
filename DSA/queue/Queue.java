package DSA.queue;

public class Queue<Item> {
    private Node first, last =  null;

    private class Node {
        Item text;
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
    public void enqueue(Item item){
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
    public Item dequeue(){
        if(isEmpty()){
            last = null;
            return null;
        } else {
            Item item = first.text;
            first = first.next;
            return item;
        }
    }

}
