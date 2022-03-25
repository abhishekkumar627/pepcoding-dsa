package Contest05.FJP3TILLDP13FEB2022;

import java.util.Scanner;

public class Pep_Java_8NonCategory_29_KnapSackProblem_DP {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arrValues = new int[n];
        int[] weights = new int[n];
        for(int i=0;i<n;i++){
            arrValues[i]= scn.nextInt();
            
        }
        for(int i=0;i<n;i++){
            
            weights[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        int dp[][] = new int[n+1][cap+1];
        int ans = maxValueInBag(arrValues,weights,cap,dp);
        System.out.println(ans);
    }

    private static int maxValueInBag(int[] arrValues,int[] weights,int cap,int[][] dp){
        int n = dp.length;
        int m = dp[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0){
                    dp[i][j] = 0;
                   
                }else if(j==0){
                    dp[i][j] = 0;
                     
                }else{
                    int noCall = dp[i-1][j];
                    int yesCall = 0;
                    if(j-weights[i-1]>=0){
                        yesCall = arrValues[i-1]+dp[i-1][j-weights[i-1]];
                    }
                    dp[i][j] = Math.max(noCall,yesCall);                    
                }            
            }
            
        }
        //print(dp);

        return dp[n-1][m-1];
    }
}
