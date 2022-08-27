package DSA.queue;

public class QueueWithResizingArray {
    private int first, last = 0;
    private String[] s;


    public QueueWithResizingArray(){
        s = new String[1];
    }
    /**
    *  @description - method the chech whether the queue is empty 
    *  @param -  
    *  @returns -  
    */
    public boolean isEmpty(){
        return s.length == 0;
    }

    /**
    *  @description - adds a new item 
    *  @param -  
    *  @returns -  
    */
    public void enqueue(String item){
        s[last++] = item;
        if(last == s.length){
            resize(s.length*2);
        }
    }

    /**
    *  @description - removes an item from queue 
    *  @param -  
    *  @returns -  
    */
    public String dequeue(){
        String item = s[first];
        first++;    

        if(last > 0 && last == (s.length/4)){
            resize(s.length/2);
        }

        return item;
    }

    private void resize(int size){
        String[] copy = new String[size];
        for(int i=0; i < s.length; i++){
            copy[i] = s[i];
        }
        s = copy;
    }
}
