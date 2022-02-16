package Level1.DP;

import java.io.*;
import java.util.*;

public class MinCostInMazeTraversal {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] dp = new int[n][m];
       
        int cost=  minCostInMazeTraversalR(arr,0,0,0,"");

        //int cost = minCostInMazeTraversalT(arr,dp);
        System.out.println(cost);
    }

   private static int minCostInMazeTraversalR(int[][] arr,int row, int col,int cost,String path){       
        //System.out.println("-----------recursive won't work for heavy test cases-------------");;
        if(row==arr.length-1 && col==arr[0].length-1){
            cost = cost + arr[row][col]; 
            return cost;
        }
        int cost1=Integer.MAX_VALUE;
        int cost2=Integer.MAX_VALUE;
        if(row+1<arr.length && col<arr[0].length){
            cost1 =  minCostInMazeTraversalR(arr,row+1,col,cost + arr[row][col],path+"v");
        }             
        if(row<arr.length && col+1<arr[0].length){
            cost2 =  minCostInMazeTraversalR(arr,row,col+1,cost + arr[row][col],path+"h");
        } 
         return Math.min(cost1,cost2); 
        
    }

    private static int minCostInMazeTraversalT(int[][] arr,int[][] dp){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr[0].length-1;j>=0;j--){
                
                if(i==arr.length-1 && j==arr[0].length-1){
                    //last box
                    dp[i][j] = dp[i][j] +arr[i][j];
                }else if(i==arr.length-1){
                    //last row
                    dp[i][j] = dp[i][j+1]+arr[i][j];
                }else if(j==arr[0].length-1){
                    //last column
                    dp[i][j] = dp[i+1][j]+arr[i][j];
                }else{
                    //rest of the matrix
                    dp[i][j] = Math.min(dp[i][j+1],dp[i+1][j])+arr[i][j];
                }

            }
        }
        return dp[0][0];
    }
}

