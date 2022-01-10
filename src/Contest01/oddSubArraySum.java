package Contest01;

import java.util.Scanner;

public class oddSubArraySum {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);       
        int n = scn.nextInt();        
        int[] arr =new int[n];
        for(int i=0;i<n;i++){            
            arr[i]=scn.nextInt();            
        }        
       int sum= oddSubArraySum(arr);
       System.out.println(sum);
        
    }

    private static int oddSubArraySum(int[] arr) {
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int count=j-i;                
                for(int k=i;k<=j;k++){                    
                    if(count % 2 == 0){
                        sum = sum+arr[k];
                    }
                }
             }
        }
        return sum;

    }
}
