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
        
        // Increment size

        
        // If there is no head...
        if (head == null) {
            // Create a new head
            
            
            // Set the tail equal to the head
            
            
        }
        // If there is a head...
        else {
            // Create a new node
            
            
            // Set the node after the tail to the new node
            
            
            // Set the new node as the tail
            
            
        }
    }
    
    // Add a new node with data to the head of the list
    // O(1) - constant time
    public void addHead(int data) {
        
        // Increment size
        

        // Create a new node

        
        // Set the node after the new node to the current head

        
        // Set the new node to be the head

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
            if (temp.getNext() != null) temp = temp.getNext();
            else break;
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

}