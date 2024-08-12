
// We have to Implements Queue's FIFO operation using LinkedList.

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


class QueueUsingLinkedList {
    Node start = new Node();
    Node end = new Node();



    public QueueUsingLinkedList() {
        
        start = null;
        end = null;
        
    }



//main method


public static void main(String[] args) {
   
    QueueUsingLinkedList l1 = new QueueUsingLinkedList();

    // start.push(88);
    l1.push(10);
    l1.push(33);
    l1.push(45);
    l1.push(90);
    

    l1.pop();
    l1.pop();
    l1.pop();

    l1.printQueue();

    int peeked = l1.peek();
    System.out.println("Peeked : "+peeked);

    boolean isempty = l1.isEmpty();
    System.out.println("isEmpty : "+isempty);

}


public void printQueue(){
    if(start == null){
        System.out.println("Queue is Empty..");
    }

    while(start != null){
        System.out.println(start.val);
        start = start.next;
    }
}



    public void push(int x) {
        Node newNode = new Node(x);

        // val = val next = null

        if (start == null) {
            start = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            end = end.next;
        }
       
    }

    public int pop() {
        if (start != null) {

            int value = start.val;
            start = start.next;
            if(start == null){
                end = null;
            }

            return value;
            // if(end != start){
            //     Node temp = start;
            //     while (temp.next.next != null) {
            //         temp = temp.next;
            //     }
            //     int remove = end.val;
            //     temp.next = null;
            //     end = temp;

            //     return remove;


            
        }
            
        return -1;
      
    }

    public int peek() {

// System.out.println("PEEK start.next "+start.next+" start.val "+start.val);

        if (start != null) {
            return start.val;
        }
        return -1;
        
    }

    public boolean isEmpty() {
        if(start == null) return true;
        return false;
    }
}