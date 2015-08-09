import java.util.Scanner;

public class PalindromeDriver
{
    public static void main(String[] args) {
        // Instantiate the scanner, a String word, a string antiword, and a Stack
        Scanner scan = new Scanner(System.in);
        String word = "";
        String antiword;
        Stack stack;
        
        // Run while the scanned word is not "quit"
        while (!word.equals("quit")) {
            // Scan in a new word
            System.out.print("Enter a word: ");
            word = scan.nextLine();
            
            // Create a new stack object
            stack = new Stack();
            
            // Push all the letters of the scanned word
            for (int i=0; i<word.length(); i++)
                stack.push(word.charAt(i));
            
            // Print the stack
            System.out.println(stack);
            
            // Set the antiword to an empty string
            antiword = "";
            
            // While the stack is not empty, pop the stack characters to the end of antiword
            while (!stack.isEmpty())
                antiword = antiword + stack.pop();
            
            // If word is the same as antiword, print "Palindrome"
            if (word.equals(antiword))
                System.out.println("Palindrome");
            else
                System.out.println("Not palindrome");
        }
    }
}