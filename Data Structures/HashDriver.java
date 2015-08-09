// Put the Dictionary and ToSpellCheck text files in the same folder as the code


import java.io.*;

public class HashDriver
{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Create an array of LinkedList with a size of 15451
        LinkedList[] list = new LinkedList[15451];
        for (int i=0; i<list.length; i++)
            list[i] = new LinkedList();
        
        String[] readWord;
        
        int num = 0;
        BufferedReader br = new BufferedReader(new FileReader("Dictionary.txt"));
        try {
            for (String line=br.readLine(); line != null; line=br.readLine()) {
                readWord = line.toString().split(" ");
                for (int j=0;j<readWord.length;j++) {
                    list[toHash(readWord[j])].addNode(readWord[j]);
                    num++;
                }
            }
        } finally { br.close(); }
        
        System.out.println(num);
        
        br = new BufferedReader(new FileReader("ToSpellCheck.txt"));
        try {
            for (String line=br.readLine(); line != null; line=br.readLine()) {
                readWord = line.toString().split("[\\.,\\s!;?:\"]+");
                for (int j=0;j<readWord.length;j++)
                    if (!list[toHash(readWord[j].toLowerCase())].contains(readWord[j].toLowerCase())) {
                        System.out.println(readWord[j] + "\tsuggest: " + suggest(readWord[j],list));
                    }
            }
        } finally { br.close(); }
    }
    
    public static String suggest(String a, LinkedList[] hash) {
        a = a.toLowerCase();
        String b = "", t;
        
        // Remove letters
        for (int i=0; i<a.length(); i++) {
            t = a.substring(0, i) + a.substring(i+1);
            if (hash[toHash(t)].contains(t)) b += t + ", ";
        }
        
        // Add letters
        for (int i=0; i<a.length(); i++) for (char j='a'; j<='z'; j++) {
                t = a.substring(0,i) + j + a.substring(i);
                if (hash[toHash(t)].contains(t)) b += t + ", ";
        }
        
        // Swap letters
        for (int i=0; i<a.length()-1; i++) {
            t = a.substring(0,i) + a.charAt(i+1) + a.charAt(i) + a.substring(i+2);
            if (hash[toHash(t)].contains(t)) b += t + ", ";
        }
        
        if (b.length() > 0) b = b.substring(0, b.length()-2);
        
        return b;
    }
    
    public static int toHash(String a) {
        int b = 0;
        for (int i=0;i<a.length();i++) b += Math.pow(23,i+1)*(int)a.charAt(i);
        return b%15451;
    }
}