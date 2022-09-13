package DSA.stack;

public class StackArray<Item> {
    private Item[] s;
    private int N = 0;

    public StackArray(){
        s = (Item[]) new Object[1];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void push(Item item){
        
        // check if the array is full
        if(N == s.length){
            // resize the array
            resize(2*s.length);
        }
        // push the item into array;
        s[N++] = item;
        
    }

    public Item pop(){
        Item item = s[--N];
        s[N] = null;
        if(N > 0 && N == (s.length/4)){
            resize(s.length /2);
        }
        return item;
    }

    private void resize(int size){
        Item[] copy =(Item[]) new Object[size];
        for(int i =0; i < s.length; i++){
            copy[i] = s[i];
        }
        s = copy;
    }
}
