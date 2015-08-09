public class LinkedList
{
    Node head;
    Node tail;
    int size;
    
    // Initialize the head node on the linked list
    public LinkedList() { 
        head = null; 
        tail = null;
        size = 0;
    }
    
    // Add a new node with data to the end of the list
    // O(1) - constant time
    public void addTail(int data) {
        size++;
        if (head == null) {
            head = new Node(data);
            tail = head;
        }
        else {
            tail.setNext(new Node(data));
            tail = tail.getNext();
        }
    }
    
    // Add a new node with data to the head of the list
    // O(1) - constant time
    public void addHead(int data) {
        size++;
        Node temp = new Node(data);
        temp.setNext(head);
        head = temp;
    }
    
    // Remove the node at a certain index
    // O(n) - linear time, worst case runs through the whole list
    public Node removeNode(int index) {
        size--;
        Node temp = head;
        int num = 0;
    
        if (temp == null) return null;
        if (temp.getNext() == null) {
            head = null;
            return temp;
        }
        if (index == 0) {
            head = head.getNext();
            return temp;
        }
        
        while (num < index - 1) {
            if (temp.getNext() != null) {
                temp = temp.getNext();
            }
            else {
                break;
            }
            
            num++;
        }
        
        Node temp2 = temp.getNext().getNext();
        Node temp3 = temp.getNext();
        
        temp.setNext(temp2);
        
        return temp3;
    }
    
    // Get the data from a certain index
    // O(n) - worst case linear time
    public Node getNode(int index) {
        Node temp = head;
        int num = 0;
        
        while (num != index && temp != null) {
            temp = temp.getNext();
            num++;
        }
        
        if (num == index) {
            return temp;
        }
        else {
            return null;
        }
    }
    
    // Return the size
    // O(1) - constant time
    public int getSize() {
        return size;
    }
    
    // Adds a node to an index with some data
    // O(n) - linear time, it has to run through the whole list
    public void addNode(int index, int data) {
        size++;
        Node temp = head;
        int num = 0;
        
        if (head == null) {
            head = new Node(data);
            tail = head;
        }
        else if (index == 0) {
            Node temp2 = new Node(data);
            temp2.setNext(head);
            head = temp2;
        }
        else {
            while (num < index - 1) {
                if (temp.getNext() != null) {
                    temp = temp.getNext();
                }
                else {
                    break;
                }
                
                num++;
            }
            
            Node temp2 = temp.getNext();
            temp.setNext(new Node(data));
            temp.getNext().setNext(temp2);
            if (temp2 != null) tail = temp2;
            else tail = temp.getNext();
        }
    }
    
    // Loop through the linked list and print the data
    public String toString() {
        Node temp = head;
        String toReturn = "";
        
        toReturn += String.valueOf(temp.getData()) + " ";
        while (temp.getNext() != null) {
            temp = temp.getNext();
            toReturn += String.valueOf(temp.getData()) + " ";
        }
        
        return toReturn;
    }
    
    public String toCString() {
        Node temp = head;
        String toReturn = "";
        
        toReturn += String.valueOf((char)temp.getData()) + " ";
        while (temp.getNext() != null) {
            temp = temp.getNext();
            toReturn += String.valueOf((char)temp.getData()) + " ";
        }
        
        return toReturn;
    }
    
    
    // Below this is for the Hash Table
    
    
    public boolean contains(String a)
    {
        for (Node temp=head; temp!=null; temp=temp.getNext()) {
            if (temp==null) return false;
            if (temp.getSData().equals(a)) return true;
        }
        return false;
    }
    
    // Add a new node with string data to the head of the list
    public void addNode(String data) {
        Node temp = new Node(data);
        temp.setNext(head);
        head = temp;
    }
    
}