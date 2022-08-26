package DSA.stack;

public class StackWithLinkedList {
    
    private Node first = null; // refers to the latest item in linked list

    private class Node {
        String text;
        Node nextNode;
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
    public void push(String item){
        Node oldfirst = first;
        first = new Node();
        first.text = item;
        first.nextNode = oldfirst;
    }

    /**
    *  @description - removes the lastest element referenced by the first pointer(the top element in the stack)
    *  @param -  
    *  @returns -  
    */
    public String pop(){
        Node node = first;
        first = first.nextNode;
        return node.text;
    }
}
