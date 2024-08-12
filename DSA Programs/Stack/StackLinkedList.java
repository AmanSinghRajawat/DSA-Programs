
// We have to Implements Stack's LIFO operation using LinkedList.

class Node{
    int val;
    Node next;
    public Node(){

    }

    public Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class StackLinkedList {

    public static void main(String[] args) {
        
        
        StackLinkedList stack = new StackLinkedList();
        stack.push(11);
        stack.push(33);
        stack.printStack(start);

        stack.push(777);
        stack.printStack(start);

        int popped = stack.pop();
        System.out.println("pop-----------" + popped);
        stack.printStack(start);

        stack.push(45455);
        stack.printStack(start);
        
        int top = stack.top();
        System.out.println("TOP "+top);

        stack.pop();


        System.out.println(stack.isEmpty());

    }

    static Node start = null;
    static Node end = null;
    

    public StackLinkedList() {
        
    }



public void printStack(Node start){
    while(start != null){
        System.out.println(start.val);
        start = start.next;
    }
}


    public void push(int x) {

        Node newNode = new Node(x);

        if(end == null){
            end = newNode;
            start = newNode;
        }else{
            end.next = newNode;
            end = end.next;
        }
       
    }

    public int pop() {
        Node head = start;
        if(head == null) return -1;

        if(head.next == null) {
            start = null;
            end = null;
            return head.val;
        }

        while(head.next.next != null){
            head = head.next;
        }
        
        head.next = null;
        int poppedValue = end.val;  // 777
        end = head;
        return poppedValue;
    }

    public int top() {
        Node head = start;
        if(head == null) return -1;
        
        while(head.next != null){
            head = head.next;
        }
        return head.val;
    }

    public boolean isEmpty() {
        if(start == null) return true;
        return false;
    }

    
}
