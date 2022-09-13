package DSA.deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private Node first, last;
    private int size = 0;

    private class Node {
        Item item;
        Node next;
        Node prev;
    }
    // construct an empty deque
    public Deque(){
        size = 0;
        first = null;
        last = null;
    }

    // is the deque empty?
    public boolean isEmpty(){
        return first == null;
    }

    // return the number of items on the deque
    public int size(){
        return size;
    }

    // add the item to the front
    public void addFirst(Item item){
        if(item == null){
            throw new IllegalArgumentException("Please pass an item.");
        }
        // if size is zero
        /* 
         * size == 0
         * first = new Node();
         * first.item = item;
         * first.next = null;
         * first.prev = null;
         * last = first;
         */
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        first.prev = null;
        if(size() == 0){
            last = first;
        }
        size++;
    }

    // add the item to the back
    public void addLast(Item item){
        if(item == null){
            throw new IllegalArgumentException("Please pass an item.");
        }

        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        last.prev = oldlast;
        oldlast.next = last;
        if(size() == 0){
            first = last;
        }
        size++;
    }

    // remove and return the item from the front
    public Item removeFirst(){
        if(size() == 0){
            throw new NoSuchElementException("Deque is empty");
        }
        Item item = first.item;
        first = first.next;
        return item;
    }

    // remove and return the item from the back
    public Item removeLast(){
        if(size() == 0){
            throw new NoSuchElementException("Deque is empty");
        }
        Item item = last.item;
        last = last.prev;
        last.next = null;
        return item;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item>  iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{

        private Node current = first;
        
        public boolean hasNext(){
            return current != null;
        }

        public void remove(){
            throw new UnsupportedOperationException("Method not supported");
        }
        public Item next(){
            if(current == null){
                throw new NoSuchElementException("Deque index out of bound");
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    public void printLinkedList(){
        Iterator<Item> iterator = this.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    // unit testing (required)
    public static void main(String[] args){
        Deque<Integer> deque = new Deque<Integer>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addFirst(4);

        deque.printLinkedList();
        deque.removeFirst();
        deque.removeLast();
        System.out.println("-----");
        deque.printLinkedList();
    }


}
