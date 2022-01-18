package LeetCode.BackTracking;

import java.util.*;


public class LeetCode784{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        List<String> ans = letterCasePermutations(input);
        System.out.println(ans);
    }

    private static List<String> letterCasePermutations(String s){       
        List<String> arrayList = new ArrayList<>(); 
        List<String> arrList =helper(s,"", arrayList);
        return arrList;
    }

    private static List<String> helper(String s,String ans,List<String> arrayList){
        if(s.length()==0){
            arrayList.add(ans);            
            return arrayList;
        }
        char ch = s.charAt(0);
        String ros = s.substring(1);
        if(ch >= '0' && ch<='9'){           
            helper(ros,ans + ch,arrayList);
        }else{
            char character = ch;
            if(ch>='A' && ch <='Z'){                
                character = (char)(ch + 32);
            }
            //for lowercase
            helper(ros,ans+character,arrayList);
            //for uppercase
            char uppercase = (char)(character-32);
            helper(ros,ans+uppercase,arrayList); 
         }
        return arrayList;

    }
    
}