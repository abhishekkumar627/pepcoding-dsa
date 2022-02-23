package Contest04.FJP3Jan302022;

import java.util.*;

public class KeypadCombination{
	
		//Given keypad sequence respective to mobile digit number
		static String[] codes = { ".", "abc", "def", "gh", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };
	
	
	public static int keyPad(String str, String[] codes, String ans) {
	   ArrayList<String> output = getKPC(str);
        for(int i=0;i<output.size();i++){
            System.out.println(output.get(i));
        }
           return output.size();
	}
    //Get reference from getKPC under recursion with Arraylists
    public static ArrayList<String> getKPC(String str) {
        
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recAns = getKPC(ros);
        ArrayList<String> myAns = new ArrayList<>();

        int idx = ch-'0';
        String code = codes[idx];

        for(int i =0;i<code.length();i++){
            char newChar = code.charAt(i);
            for(String s:recAns){                
                myAns.add(newChar+s);
        }}
        return myAns;
    }
		
	//Driver program				
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		System.out.println(keyPad(s, codes, ""));
		}

		
	}
