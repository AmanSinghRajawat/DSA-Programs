
// We have to Implements Queue's FIFO operation using Array.

public class QueueUsingArray {

    int arr[] = new int [10];
    int front = -1;
    int rear = -1;
    
    public QueueUsingArray(){

    }


    public void push(int x){
        if(rear < 0){
            rear++;
            front++;
            arr[rear] = x;
        }else{
            rear++;
            arr[rear] = x;
        }
    }

    public int pop(){
        if(rear < 0){
            System.out.println("Q is Empty");
            return -1;
        }
        int poppedValue = arr[front];
        front++;
        return poppedValue;
    }

    public int top(){
        return arr[front];
    }

    public boolean isEmpty(){
        if(rear < 0) return true;
        return false;
    }
    
}
