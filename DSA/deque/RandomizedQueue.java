package DSA.deque;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private Node first, last;
    private int size = 0;

    private class Node {
        Item item;
        Node next;
        Node prev;
    }

    // construct an empty randomized queue
    public RandomizedQueue(){
        size = 0;
        first = null;
        last = null;
    }

    // is the randomized queue empty?
    public boolean isEmpty(){
        return first == null;
    }

    // return the number of items on the randomized queue
    public int size(){
        return size;
    }

    // add the item
    public void enqueue(Item item){
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

    // remove and return a random item
    public Item dequeue(){
        int Random = getRandomNumber(0, size);
        
        Iterator iterator = iterator();
    }

    // return a random item (but do not remove it)
    public Item sample(){

    }

    // return an independent iterator over items in random order
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

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    // unit testing (required)
    public static void main(String[] args){
        RandomizedQueue<Integer> rqueue = new RandomizedQueue<Integer>();
        System.out.println(rqueue.getRandomNumber(0,10));
    }

}