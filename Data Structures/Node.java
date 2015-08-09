public class Node
{
    // Variables to store an integer data and a Node to point to the next node
    int data;
    Node next;
    
    // Store strings for the Spell Check hash table
    String sData;
    
    // Constructor: initialize the data
    public Node(int d) { data = d; }
    
    // Initialize the next node
    public void setNext(Node n) { next = n; }
    
    // Return the next node
    public Node getNext() { return next; }
    
    // Return the data
    public int getData() { return data; }
    
    
    
    // Initialize the string data
    public Node(String d) { sData = d; }
    
    // Return the string data
    public String getSData() { return sData; }
}