package Contest06.FJP3Contest090322;

import java.util.Scanner;

public class FashionShow {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        arrangeFashionableContent(arr,n);
        print(arr,n);
    }
    
    private static void arrangeFashionableContent(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                  swap(arr,i,i+1);
                }
            }else{
                if(arr[i]<arr[i+1]){
                  swap(arr,i,i+1);
                }
            }
        }
    }
    
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void print(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}