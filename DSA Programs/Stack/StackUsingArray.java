import java.util.Arrays;

// We have to Implements Stack's LIFO operation using Array.

class StackUsingArray {
    
    static int top;
    static int arr[] = new int[10];

    public StackUsingArray() {
        top = -1;
    }


    public static void main(String[] args) {
        
        StackUsingArray stack = new StackUsingArray();
        stack.push(33);
        stack.push(36663);
        stack.push(99);
        System.out.println("top "+top);
        int poped = stack.pop();
        int toped = stack.top();
        
        System.out.println("toped "+toped);
        System.out.println("poped "+poped);
        System.out.println(Arrays.toString(arr)+" poped ");
        
    }

   
    public void push(int x) {
        if(top < 0){
            arr[++top] = x;
        }else{
            top++;
            arr[top] = x;
        }
    }
    
    public int pop() {
       if(top > -1){
        int val = arr[top];
        arr[top] = -1;
        top--;
        return val;
       }
       return -1;
    }
    
    public int top() {
       if(top < 0) return -1;
       return arr[top];
    }
    
    public boolean isEmpty() {
       if(top < 0) return true;
       return false;
    }
};