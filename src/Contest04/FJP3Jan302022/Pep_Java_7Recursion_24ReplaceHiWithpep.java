package Contest04.FJP3Jan302022;
import java.io.*;
import java.util.*;

public class Pep_Java_7Recursion_24ReplaceHiWithpep {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        String inputArray[] = input.split(" ");
        String input1 = inputArray[0];
        int input2 = Integer.parseInt(inputArray[1]);
        String output = printOutput(input1);
        System.out.println(output.charAt(input2));
        System.out.println(output);
    }
    
    private static String printOutput(String input1){
        return printReplacedString(input1,"");
    }
    
    private static String printReplacedString(String input1, String ans){
        if(input1.length()==0){
            return "";
        }
        char firstChar = input1.charAt(0);
        String ros = input1.substring(1);
        String recAns =  printReplacedString(ros,ans);
        if(recAns!=""){
            char firstCharOfRecAns = recAns.charAt(0);
            if(firstCharOfRecAns=='i' && firstChar =='h'){
                ans = firstChar+ "" +firstCharOfRecAns + recAns.substring(1);
                ans = ans.replace("hi","pep");
            }else{
                ans = firstChar+ "" +recAns; 
            }
    
        }else{
            ans = firstChar + recAns + ans;
        }
        return ans;
    }
}

