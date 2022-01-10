package Contest01;

import java.util.Scanner;

class MissingPositive{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
       int n = scn.nextInt();
       int[] arr =new int[n];
       for(int i=0;i<n;i++){
           arr[i]=scn.nextInt();
       }
      
       int val=missingPositive(arr);
       System.out.println(val);
    }

    private static int missingPositive(int[] arr) {
        int sum=0;        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                sum = sum+arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        int nSum = (max*(max+1))/2;       
        return nSum-sum;
    }
}