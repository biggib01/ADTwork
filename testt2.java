package ADT;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class testt2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/User/Desktop/SEwork2/ADT/test1.txt");
        Scanner sc = new Scanner(file);
        Path pt = Path.of("C:/Users/User/Desktop/SEwork2/ADT/test1.txt");
        String data = Files.readString(pt);
        String [] word = data.split("\\s");
    
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine()); 
        }

        System.out.println(data.length());
        
        System.out.println("Words : "+countWords(data));

        System.out.println("Character : "+countChar(data));

    
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

}
