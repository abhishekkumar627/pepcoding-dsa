package Contest04.FJP3Jan302022;

import java.io.*;
import java.util.*;

public class ExitPointofamatrix {
public static Scanner scn = new Scanner(System.in);
    // This is a functional problem. 
    // Input is managed for you.
    // Don't change main, write your code in the function below
    public static void main(String[] args) {
       int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}

		}
		exitPoint(arr);
    }


    public static void exitPoint(int[][] arr) {
        //Define directions 
        // East=0,South=1,West=2,North=3;
		int i =0,j=0;
        int n= arr.length;
        int m = arr[0].length;
        int dir=0;
        while(true){
            dir= dir+arr[i][j];
            dir = dir % 4;

            if(dir==0){
                j++;
            }else if(dir==1){
                i++;
            }else if(dir==2){
                j--;
            }else{
                i--;
            }

            if(i<0 || j<0 || i>=n||j>=m){
                break;
            }
        }

        if(i<0){
            i++;
        }else if (j<0){
            j++;
        }else if(i>=n){
            i--;
        }else if(j>=m){
            j--;
        }

        System.out.println(i+", "+ j);        
	}
}
