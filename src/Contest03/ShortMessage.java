package Contest03;
import java.util.Scanner;
//import java.util.Arrays;
public class ShortMessage
{
	
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String encodedMsg = scn.nextLine();
       // String decodedMsg = decode(encodedMsg);
       // System.out.println(decodedMsg);
        String ans=decodeString(encodedMsg);        
        System.out.println(ans);
    }

    private static String decode(String encodedMsg){
        StringBuilder bf = new StringBuilder();
        if(encodedMsg.length()>0){
        String encodeMessage = encodedMsg.replace("\"","");
        String[] splitedArray = encodeMessage.split("]");
        //System.out.println(Arrays.toString(splitedArray));
        
        for(int i=0;i<splitedArray.length;i++){
            int k = Integer.parseInt(String.valueOf(splitedArray[i].charAt(0)));
            //System.out.println(k);
            String repeatingString = splitedArray[i].substring(2);
            //System.out.println(repeatingString);
            while(k>0){
                bf.append(repeatingString);
                k--;
            }
        }
        return "\""+bf.toString()+"\"";   
    }
    return bf.toString(); 
    }

    public static  int pos = 0;
    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        String num = "";
        for (int i = pos; i < s.length(); i++) {
            if (s.charAt(i) != '[' && s.charAt(i) != ']' && !Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else if (Character.isDigit(s.charAt(i))) {
                num += s.charAt(i);
            } else if (s.charAt(i) == '[') {
                pos = i + 1;
                String next = decodeString(s);
                for (int n = Integer.valueOf(num); n > 0; n--) sb.append(next);
                num = "";
                i = pos;
            } else if (s.charAt(i) == ']') {
                pos = i;
                return sb.toString();
            }
        }
        return sb.toString();
    }

}
