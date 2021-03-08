package ADT;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) throws IOException {
        File F = new File("C:/Users/User/Desktop/SEwork2/ADT/test1.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(F));
        
        String st;
        while((st = br.readLine()) != null){
            System.out.println(st);
        }

        countWord(st);
        //System.out.print("Total Words : ");
        //System.out.println(countWord(dat));    
          
    }

    static int countWord(String F){
        int count=0;  
      
            char ch[]= new char[F.length()];     
            for(int i=0;i<F.length();i++)  
            {  
                ch[i]= F.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
 
            }  
            return count;
            
        
    }
}

