public class LinkedListDriver
{
    public static void main(String[] args) {
        // Instantiate and initialize the Linked List
        LinkedList list = new LinkedList();
        
        // Add 5 objects to the list: 1,2,3,4,5
        list.addTail(1);
        list.addTail(2);
        list.addTail(3);    
        list.addTail(4);      
        list.addTail(5);
        
        // Print the list and the size of the list
        System.out.println("List: " + list);
        System.out.println("Size: " + list.getSize());
        
        // Remove the node in the second position
        System.out.println("Removing the second node");
        list.removeNode(2);
        
        // Print the list and the size of the list
        System.out.println("Size: " + list.getSize());
        System.out.println("List: " + list);
    }
}