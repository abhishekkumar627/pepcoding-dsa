package Contest04.FJP3Jan302022;
import java.io.*;
import java.util.*;

public class Pep_Java_7Recursion_20SeparateDuplicates {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String str1[] = str.split(" ");
        String input = str1[0];
        int value = Integer.parseInt(str1[1]);
        String output = printOutput(input,value);
        System.out.println(output.charAt(value));
        System.out.println(output);
    }
    
    private static String printOutput(String str, int value){        
        return printStr(str,"");
    }
    
    private static String printStr(String str,String ans){
    
            if(str.length()==0){
                return "";
            }
            char firstChar = str.charAt(0);
            String ros = str.substring(1);    
            String recAns = printStr(ros,ans);
            if(recAns!=""){
                char firstCharOfRosString = recAns.charAt(0);
                if(firstChar == firstCharOfRosString){
                    ans =  firstChar+"*"+ firstCharOfRosString +""+ recAns.substring(1) ;
                }else{
                    ans = firstChar +""+ firstCharOfRosString +""+ recAns.substring(1);
                }
            }else{
                ans =  firstChar + ans;
            }
        
            return ans;    
            }
}