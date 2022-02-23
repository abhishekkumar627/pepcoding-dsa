package Contest04.FJP3Jan302022;

import java.io.*;
import java.util.*;

public class Pep_Java_4OneDArray_9TargetSumTriplet {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        Arrays.sort(arr);
        printTargetSumTriplets(arr,0,"",0,tar,0);//print only elements with 3 elements summing up to target value.
        
    }
    
    public static void printTargetSumTriplets(int[] arr, int idx, String asf, int sum, int tar,int count) {
        if(sum>tar)return;
        if(idx == arr.length){
            if(sum==tar && count==3){
                System.out.println(asf);
            }
            return;
        }
        String output="";
        if(count==0){
            output = asf+arr[idx]+", ";
        }
        else if(count==1){
            output = asf+arr[idx]+" ";
        }else if(count==2){
            output = asf+"and "+arr[idx];
        }
        
        //Element Picked
        printTargetSumTriplets(arr, idx+1, output, sum + arr[idx], tar,count+1);
        
        
        //Element Not Picked
        printTargetSumTriplets(arr, idx+1, asf, sum, tar,count);
    }
    
    

}
