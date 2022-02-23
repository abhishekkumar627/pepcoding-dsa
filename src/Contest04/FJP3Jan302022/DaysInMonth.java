package Contest04.FJP3Jan302022;

import java.io.*;
import java.util.*;

public class DaysInMonth {

    public static void main(String[] args) {
        String[] daysArray = {"mon","tues","wed","thurs","fri","sat","sun"};
        int[] daysToAdd={7,6,5,4,3,2,1};
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();      
        
        while(t>0){
            String inp = scn.nextLine();
            if(inp != "" && inp.length()!=0){
                //System.out.println(inp);
                String[] input = inp.split(" ");
                int days = Integer.parseInt(input[0]);
                String day = input[1];
                printOutput(days,day,daysArray,daysToAdd);
                System.out.println();
                t--;        
            }
        }
    }
    
    private static void printOutput(int days,String day,String[] daysArray, int[] daysToAdd){
        int[] outputArray = new int[daysArray.length];
        int index = 0;
        for(int i =0;i<daysArray.length;i++){            
            if(daysArray[i].equals(day)){
                index = i;
                break;
            }            
        }
        int dayToAdd = daysToAdd[index] +1;        
        for(int i=0;i<7;i++){           
           int total = 0;
           int count = 0;
           while(total +7  <=days){
               if(count == 0){                   
                       total = count + dayToAdd + total  + i ;
                   if(total > 7){
                       count = count+1;
                   }
               }else{
                   total = total + 7;
               }               
               count = count + 1;
               

           }
            //System.out.println(total +"---" + count);
           outputArray[i] = count;
        }
        
        for(int i =0;i<daysArray.length;i++){
            System.out.print(outputArray[i]+" ");          
        }
        
    }
}
