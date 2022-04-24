package Contest06.FJP3Contest090322;

import java.util.Scanner;

public class PhoneBooth {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        scn.close();
        boolean result = phonebooth(arr,n,k);
        System.out.println(result);
    }
    
    private static boolean phonebooth(int[] arr, int n, int k){
        if(n < k){
            return false;
        }
        
        int sum =0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                if(i+1<n && i+2<=n){
                    if(arr[i+2]==0 && arr[i+1]==0 && i+3<n && arr[i+3]!=1){
                            arr[i+2] = 1;
                            sum = sum +1;
                         if(sum>=k){
                            return true;
                         }
                    }
                }
            }
        }
        if(sum>=k){
            return true;
        }
        
        return false;
    }
}
