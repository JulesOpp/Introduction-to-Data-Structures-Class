import java.io.*;

public class HashDriver
{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // Create an array of LinkedList with a size of 15451
        LinkedList[] list = new LinkedList[15451];
        
        // For each index in the list, initialize the list
        for (int i=0; i<0; i++) {

            
            
        }
        
        
        // BufferedReader allows you to loop through a text file
        BufferedReader br = new BufferedReader(new FileReader("Dictionary.txt"));
        String[] readWord;
        
        // The try is for exception handling if anything goes wrong
        try {
            // There may be multiple words per line in the dictionary
            // Loop through each line
            for (String line=br.readLine(); line != null; line=br.readLine()) {
                
                // Split each line by 'space' using the line's toString and 
                //      split methods and store the result in readWord
                
                
                
                // For each word in readWord: 
                //  Find the hash of that word
                //  Add the word to the list using the addNode method
                for (int j=0; j<readWord.length; j++) {
                    
                    
                    
                }
                
            }
        } finally { br.close(); }
        
        
        // Load some text file to spell check
        br = new BufferedReader(new FileReader("ToSpellCheck.txt"));
        
        // The try is for exception handling if anything goes wrong
        try {
            // Read each line from the text file
            for (String line=br.readLine(); line != null; line=br.readLine()) {
                
                // Split each line by "[//.,//s!;?:/"]+" (most punctuation) using toString and split and
                //      store the result in readWord

                
                
                // For each word in readWord:
                //  Take the lower case of the word
                //  Compute the hash of that word
                //  Check if the LinkedList at the hash index contains the word
                //      If it does not contain the word, print the misspelled word and suggested words
                for (int j=0; j<readWord.length; j++) {
   
                    
                    
                }
            }
        } finally { br.close(); }
    }
    
    public static String suggest(String a, LinkedList[] hashTable) {
        a = a.toLowerCase();
        String output = "";
        String temp = "";
        
        // Remove letters
        // For each letter in the String a...
        for (int i=0; i<a.length(); i++) {
            // Set temp to a without the letter at the ith index
            // Use the substring method (twice)

            
            
            // If temp is contained in the hashTable, add temp to output

            
            
        }
        
        // Add letters
        // For each letter in the String a...
        for (int i=0; i<a.length(); i++) {
            // For each letter in the alphabet...
            for (char j='a'; j<='z'; j++) {
                // Set temp to a plus some letter in the ith index
                // Use the substring method (twice)

                
                
                // If temp is contained in the hasTable, add temp to output

                
                
            }
        }
        
        // Swap letters
        // For each letter in the String a -1...
        for (int i=0; i<a.length()-1; i++) {
            // Set temp to a with the two letters at i and i+1 switched
            // Use the substring method (twice) and the charAt method (twice)

            
            
            // If temp is contained in the hasTable, add temp to output

            
            
        }
 
        
        return output;
    }
    
    // Feel free to create your own hash
    public static int toHash(String a) {
        int b = 0;
        
        for (int i=0;i<a.length();i++) {
            b += Math.pow(23,i+1)*(int)a.charAt(i);
        }
        
        return b % 15451;
    }
}