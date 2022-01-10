package Contest01;

import java.util.Scanner;

class SpecialNumber{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);       
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            arr[i][j]=scn.nextInt();
            }
        }        
        specialPosition(arr);
        
    }

    private static void specialPosition(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    boolean isSpecialNumber = checkSpecialNumber(arr,i,j);
                    if(isSpecialNumber){
                        System.out.println(i+", "+j);
                    }
                }
            }
        }  
    }

    private static boolean checkSpecialNumber(int[][] arr, int i, int j) {
        int count=0;
        for(int jx=0;jx<arr[0].length;jx++){
            if(arr[i][jx]==1){
                count++;
            }
        }
        for(int ix=0;ix<arr.length;ix++){
            if(arr[ix][j]==1){
                count++;
            }
        }

        return count>2?false:true;
    }
}

