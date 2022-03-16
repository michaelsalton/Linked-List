public class linked_list{

    static class LinkedList {
        Node head; // head of the list
        /* Linked list Node*/
        static class Node {
            int data;
            Node next;
            // Constructor to create a new node
            // Next is by default initialized
            // as null
            Node(int d) { data = d; }
            }

            // insert new node at position
    public void insert(int value, int position){
        // point to start of list
        Node current = head;
        // keep track of previous node
        Node previous = null;
        // find insertion point
        while(current != null && position > 0){
            // decrement the position
            position--;
            // set previous to current
            previous = current;
            // set current to next
            current = current.next;
        }
        // make a new node
        Node newNode = new Node(value);
        //check for start of list
        if(previous == null){
            // set start of list to new node
            head = newNode;
        }
        else{
            // set previous node to new node
            previous.next = newNode;
        }
        // new node points to current node
        newNode.next=current;
    }
    // delete node at position
    public void delete(int position){
        // point to start of list
        Node current = head;
        // keep track of previous node
        Node previous = null;
        // find insertion point in a loop
        while(current != null && position > 0){
            // decrement the position
            position--;
            // keep track of previous
            previous = current;
            // current is current next
            current = current.next;
        }
        //check for start of list
        if(previous == null){
            // set start of list to new node
            head = current.next;
        }
        else{
            // set previous node to new node
            previous.next = current.next;
        }
    }

    // print out list
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.print("\n");
    }
}

    public static void main (String[] args){
        LinkedList list = new LinkedList();
    }
}

