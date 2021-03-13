package ADT.AS3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class test {
    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
       
    static String infixToPostfix(String exp) 
    { 

        String result = new String(""); 
           
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
              
            if (Character.isLetterOrDigit(c)){ 
                result += c; 
               
            }
            else if (c == '('){
                stack.push(c); 
            }
            else if (c == ' '){
                
            } 
            else if (c == ')') {

                while (!stack.isEmpty() &&  
                        stack.peek() != '(') 
                    result += stack.pop(); 
                  
                    stack.pop(); 
            } 
            else {
                 
                while (!stack.isEmpty() && Prec(c)  
                         <= Prec(stack.peek())){ 
                    
                    result += stack.pop(); 
             } 
                stack.push(c); 
            } 
        } 
       
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            result += stack.pop(); 
         } 
        return result; 
    } 
    public static void main(String[] args) throws FileNotFoundException {
        File F = new File("C:/Users/User/Desktop/SEwork2/ADT/AS3/input1.txt");
        Scanner in = new Scanner(F);
        ArrayList<String> keep = new ArrayList<String>();
        String line = "";
        while(in.hasNextLine()){
            line += in.nextLine();
            keep.add(line);
            line = "";
            
        }
        
      for(int i = 0 ; i < keep.size(); i++){
          System.out.println(infixToPostfix(keep.get(i)));
      }
    }
}
