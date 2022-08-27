package DSA.stack;

public class Stack<Item> {
    
    Node first = null;

    private class Node {
        Item item;
        Node next;
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

}
