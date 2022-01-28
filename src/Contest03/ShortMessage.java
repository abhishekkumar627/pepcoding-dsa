package Contest03;
import java.util.Scanner;
//import java.util.Arrays;
public class ShortMessage
{
	
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String encodedMsg = scn.next();
        String decodedMsg = decode(encodedMsg);
        System.out.println(decodedMsg);
    }

    private static String decode(String encodedMsg){
        String encodeMessage = encodedMsg.replace("\"","");
        String[] splitedArray = encodeMessage.split("]");
        //System.out.println(Arrays.toString(splitedArray));
        StringBuilder bf = new StringBuilder();
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

}
