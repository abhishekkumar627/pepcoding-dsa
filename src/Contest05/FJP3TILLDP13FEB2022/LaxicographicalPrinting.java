package Contest05.FJP3TILLDP13FEB2022;

import java.util.Scanner;

public class LaxicographicalPrinting {
    public static void rec(int i, int n){
        if(i >= n){
            return;
        }
        System.out.println(i);
        for(int j = 0; j < 10 ; j++){
            rec(10 * i + j,n);
        }
    }
    public static void main(String[] args) {
        
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 1; i <= 9; i++){
            rec(i,n);
        }
    }
}
