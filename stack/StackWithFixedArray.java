package DSA.stack;

public class StackWithFixedArray {
    
    private String[] s;
    private int N = 0;

    private StackWithFixedArray(Integer capacity){
        s = new String[capacity];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void push(String item){
        if(N+1 < s.length){
            s[N++] = item;
        }
    }

    public String pop(){
        if(N != 0){ 
            String item = s[--N];
            s[N] = null;
            return item;
        }
        return "";
    }
}
