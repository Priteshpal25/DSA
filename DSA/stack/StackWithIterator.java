package DSA.stack;
import java.util.Iterator;

public class StackWithIterator<Item> implements Iterable<Item>{
    
    Node first = null;

    private class Node {
        Item item;
        Node next;
    }

    public Iterator<Item>  iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{

        private Node current = first;
        
        public boolean hasNext(){
            return current != null;
        }

        public void remove(){

        }
        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    /**
    *  @description - return whether the stack is empty 
    *  @param -  
    *  @returns -  
    */
    public boolean isEmpty(){
        return first == null;
    }

        /**
    *  @description -  creates a new node and moves the first pointer to it
    *  @param -  
    *  @returns -  
    */
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    /**
    *  @description - removes the lastest element referenced by the first pointer(the top element in the stack)
    *  @param -  
    *  @returns -  
    */
    public Item pop(){
        Node node = first;
        first = first.next;
        return node.item;
    }

    /**
    *  @description - Print the items of stack 
    *  @param -  
    *  @returns -  
    */

    public void printLinkedList(){
        Iterator<Item> iterator = this.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
