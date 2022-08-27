package DSA.stack;
/* Space complexity
 * 
 * 
 */
public class StackWithResizingArray {
    private String[] s;
    private int N = 0;

    public StackWithResizingArray(){
        s = new String[1];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void push(String item){
        
        // check if the array is full
        if(N == s.length){
            // resize the array
            resize(2*s.length);
        }
        // push the item into array;
        s[N++] = item;
        
    }

    public String pop(){
        String item = s[--N];
        s[N] = null;
        if(N > 0 && N == (s.length/4)){
            resize(s.length /2);
        }
        return item;
    }

    private void resize(int size){
        String[] copy = new String[size];
        for(int i =0; i < s.length; i++){
            copy[i] = s[i];
        }
        s = copy;
    }
}
