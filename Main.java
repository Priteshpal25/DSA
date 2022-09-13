// import DSA.queue.*;
// import DSA.stack.*;

// public class Main {
    
//     public static void main(String[] args){
//         // QueueWithLinkedList llQueue = new QueueWithLinkedList();
//         // QueueWithResizingArray arrQueue = new QueueWithResizingArray();
//         // llQueue.enqueue("to");
//         // llQueue.enqueue("be");
//         // llQueue.enqueue("not");
//         // System.out.println(llQueue.dequeue());


//         // arrQueue.enqueue("to");
//         // arrQueue.enqueue("be");
//         // arrQueue.enqueue("not");
//         // System.out.println(arrQueue.dequeue());
//         // System.out.println(arrQueue.dequeue());
//         // System.out.println(arrQueue.dequeue());
//         // System.out.println(arrQueue.dequeue());

//         // Stack<Integer> stack = new Stack<Integer>();
//         // stack.push(1);
//         // stack.push(2);
//         // System.out.println(stack.pop());
//         // stack.push(3);
//         // System.out.println(stack.pop());
//         // stack.push(4);
//         // stack.push(5);
//         // System.out.println(stack.pop());
//         // StackArray<Integer> stackarr = new StackArray<Integer>();
//         // stackarr.push(1);
//         // stackarr.push(2);
//         // System.out.println(stackarr.pop());
//         // stackarr.push(3);
//         // System.out.println(stackarr.pop());
//         // stackarr.push(4);
//         // stackarr.push(5);
//         // System.out.println(stackarr.pop());

//         StackWithIterator<Integer> stack = new StackWithIterator<Integer>();
//         stack.push(1);
//         stack.push(2);
//         stack.pop();
//         // System.out.println(stack.pop());
//         stack.push(3);
//         stack.pop();
//         // System.out.println(stack.pop());
//         stack.push(4);
//         stack.push(5);

//         // Iterator<Integer> iterator = stack.iterator();
//         // while(iterator.hasNext()){
//         //     System.out.println(iterator.next());
//         // }
//         stack.printLinkedList();
//         stack.push(6);
//         stack.printLinkedList();

//     }
// }


// import java.io.*;
// import java.util.*;


// public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         int M = Integer.parseInt(br.readLine().trim());
         int S = Integer.parseInt(br.readLine().trim());
         String[] arr_U = br.readLine().split(" ");
         int[] U = new int[M];
         for(int i_U = 0; i_U < arr_U.length; i_U++)
         {
         	U[i_U] = Integer.parseInt(arr_U[i_U]);
         }
         String[] arr_V = br.readLine().split(" ");
         int[] V = new int[M];
         for(int i_V = 0; i_V < arr_V.length; i_V++)
         {
         	V[i_V] = Integer.parseInt(arr_V[i_V]);
         }
         String[] arr_W = br.readLine().split(" ");
         int[] W = new int[M];
         for(int i_W = 0; i_W < arr_W.length; i_W++)
         {
         	W[i_W] = Integer.parseInt(arr_W[i_W]);
         }

         long[] out_ = solve(N, M, S, U, V, W);
         System.out.print(out_[0]);
         for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
         {
         	System.out.print(" " + out_[i_out_]);
         }

         wr.close();
         br.close();
    }
    static long[] solve(int N, int M, int S, int[] U, int[] V, int[] W){
       // Write your code here
        long[] result = {0};
        int[][] graph = new int[N][N];

        for(int i = 0; i< N; i++){
            int u = U[i];
            int v = V[i];
            int w = W[i];
            graph[u-1][v-1] = w;
            graph[v-1][u-1] = w;
        }

        int pathArray = new int[N];
        return result;
    
    }

    static int calculatePath(int sourceNode, int endNode){
        
        if(sourceNode == endNode){
            return 0;
        } else {
            int cost = 0;
            int nextNodeCost = nextNode(sourceNode, endNode);
            cost = cost + nextNodeCost;
        }
    }
}