# RESIZING ARRAY SPACE COMPLEXITY
8 bytes reference to array
24 bytes (array overhead)
8 bytes x array size
4 bytes(int)
4 bytes padding
public class StackWithResizingArray {  

    private String[] s;
    private int N = 0;

}

# TRADOFFS /CONCLUSION
So for linked lists, every operation takes constant time in the worst case, that's a guarantee. But we have to use a little extra time and space to deal with the links. So it's going to be slower.
Resizing-array implementation. We have a good amortized time, so total averaged over the whole process is good. We have less wasted space and probably faster implementation of each operation.