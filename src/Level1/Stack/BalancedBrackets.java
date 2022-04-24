package Level1.Stack;

import java.util.*;

public class BalancedBrackets {

    public static void main(String[] args) throws Exception {
        try (Scanner scn = new Scanner(System.in)) {
            String s = scn.nextLine();
            boolean isBalancedBrackets = checkBrackets(s);
            System.out.println(isBalancedBrackets);
        }
    }
    
    private static boolean checkBrackets(String s){
        char[] arr = s.toCharArray();        
        Stack<Character> stack = new Stack();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='{' || arr[i]=='[' || arr[i]=='('){
                stack.push(arr[i]);
            }else if(arr[i]=='+' || arr[i]=='/' || 
            arr[i]=='-' || arr[i]=='*' || (arr[i]>='a' && arr[i]<='z') || arr[i]==' '){
                continue;
            }
            else{
                if(stack.empty()){
                    return false;
                }
                char c = stack.pop();
                
                if((arr[i]=='}' && c=='{') 
                   || (arr[i]==']' && c=='[') 
                   || (arr[i]==')' && c=='(')){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }

}