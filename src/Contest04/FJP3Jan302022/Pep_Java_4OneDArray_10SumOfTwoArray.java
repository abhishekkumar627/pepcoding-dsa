package Contest04.FJP3Jan302022;
import java.io.*;
import java.util.*;

public class Pep_Java_4OneDArray_10SumOfTwoArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr1 = new int[N];
        for(int i =0;i<N;i++){
            arr1[i] = scn.nextInt();
        }
        int M = scn.nextInt();
        int[] arr2 = new int[M];
        for(int i =0;i<M;i++){
            arr2[i] = scn.nextInt();
        }
        int size = N>=M?N:M;
        int[] arr3 = new int[size];
        sumOfTwoArrays(arr1,arr2,arr3);
        display(arr3);
        
    }
    
    private static void sumOfTwoArrays(int[] arr1,int[] arr2,int[] arr3){   
        
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = arr3.length-1;
        int carry =0;
        while(i>=0 || j>=0){
            int total =0;
            if(i>=0){
                total = total + arr1[i];
            }
            if(j>=0){
                total = total + arr2[j];
            }
            total = total + carry;
            int rem = total % 10;
            carry = total / 10;
            arr3[k] = rem;
            i--;
            j--;
            k--;
        }
        if(carry>0){
            System.out.print(carry+" ");
        }        
    }
    
    private static void display(int[] arr3){
        for(int i =0;i<arr3.length;i++){
            System.out.print(arr3[i]+ " ");
        }
    }
}

