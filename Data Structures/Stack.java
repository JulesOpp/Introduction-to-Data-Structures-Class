public class Stack
{
    LinkedList list;
    
    // Instantiate and initialize the linked list
    public Stack()              { list = new LinkedList(); }
    
    // Add a node to the top of the list (cast the character as an integer)
    public void push(char ch)   { list.addNode(0, (int)ch); }
    
    // Remove and return the top of the list
    public char pop()           { return (char)list.removeNode(0).getData(); }
    
    // Return the top of the list without removing it
    public char top()           { return (char)list.getNode(0).getData(); }
    
    // Check whether the list is empty
    public boolean isEmpty()    { if (list.getSize() == 0) return true; return false; }
    
    // Print the list (use the toCString method)
    public String toString()    { return list.toCString(); }
}