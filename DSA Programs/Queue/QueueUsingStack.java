import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// We have to Change the Queue's FIFO operation to Stack's LIFO operation.

public class QueueUsingStack {
    
    Queue<Integer> q = new LinkedList<>();
    
    public static void main(String[] args) {
        QueueUsingStack obj = new QueueUsingStack();

        obj.push(22);
        obj.push(66);
        obj.push(54);

        obj.PrintQueue();
        int poppedValue = obj.pop();
        System.out.println("Popped : "+poppedValue);
        obj.PrintQueue();
        System.out.println("Top : "+obj.top());

    }


    // Constructor...
    public QueueUsingStack() {

    }

    public void PrintQueue(){
        Iterator<Integer> itr = q.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

    public void push(int x) {
       int sizeOfQ = q.size();  // 123
       q.add(x);  // 1234

       for(int i=0; i<sizeOfQ; i++){
            q.add(q.peek());   // 12341
            q.remove();   // 2341
       }
       // q = 4123
    }

    public int pop() {
        if(q.isEmpty()){
            System.out.println("Q is Empty ");
            return -1;
        }
      
        return q.remove();    // q 4123  after pop 123
    }

    public int top() {
        if(q.isEmpty()){
            System.out.println("Q is Empty not having any TOP");
            return -1;
        }
        return q.peek();
    }

    public boolean isEmpty() {
        if(q.size() == 0) return true;
        return false;
    }
}