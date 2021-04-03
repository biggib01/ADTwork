package ADT;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class AS2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/User/Desktop/SEwork2/ADT/test1.txt");
        Scanner sc = new Scanner(file);
        Path pt = Path.of("C:/Users/User/Desktop/SEwork2/ADT/test1.txt");
        String data = Files.readString(pt);
    
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine()); 
        }
        
        System.out.println();
        System.out.println("Words : "+countWords(data));

        System.out.println("Character : "+countChar(data));

        System.out.println("Palindrome : "+ countPalin(data));

    
    sc.close();
    } 

    public static int countWords(String s){

        int wordCount = 0;
    
        boolean word = false;
        int endOfLine = s.length() - 1;
    
        for (int i = 0; i < s.length(); i++) {
        
            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;
                
            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;
                
            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

    public static int countChar(String S){
        int count = 0;    
            
        for(int i = 0; i < S.length(); i++) {    
            if(Character.isLetter(S.charAt(i))){
                count++;
            }           
        }
        return count;
    }

    public static boolean checkPalin(String word)
    {
        int n = word.length();
        word = word.toLowerCase();
        for (int i=0; i<n; i++,n--)
           if (word.charAt(i) != word.charAt(n - 1))
              return false;       
        return true;
    }

    public static int countPalin(String str)
    {      
        str = str + " ";
        
        String word = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
          
            if (ch != ' ')
                word = word + ch;
            else {
                if (checkPalin(word))
                    count++;
                word = "";
            }
        }
          
        return count;
    }
}
