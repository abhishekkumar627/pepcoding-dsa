package Backtracking;

import java.util.*;

public class KnightsProblem{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] chess = new int[n][n];
        printKnightsTour(chess,row,col,1);
    }
   // static int[][] dir={}
    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        if(chess[r][c]>0){
            return;
        }
        int n = chess.length * chess.length;        
        if(upcomingMove==n){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = upcomingMove;
        if(r-2>= 0 && r-2 < chess.length && c+1>=0 && c+1<chess[0].length){
            printKnightsTour(chess,r-2,c+1,upcomingMove+1);
        }
        if(r-1>= 0 && r-1 < chess.length && c+2>=0 && c+2<chess[0].length){
            printKnightsTour(chess,r-1,c+2,upcomingMove+1);
        }
        if(r+1>= 0 && r+1 < chess.length && c+2>=0 && c+2<chess[0].length){
             printKnightsTour(chess,r+1,c+2,upcomingMove+1);
        }
        if(r+2>= 0 && r+2 < chess.length && c+1>=0 && c+1<chess[0].length){
             printKnightsTour(chess,r+2,c+1,upcomingMove+1);
        }
        if(r+2>= 0 && r+2 < chess.length && c-1>=0 && c-1<chess[0].length){
            printKnightsTour(chess,r+2,c-1,upcomingMove+1);
        }
        if(r+1>= 0 && r+1 < chess.length && c-2>=0 && c-2<chess[0].length){
            printKnightsTour(chess,r+1,c-2,upcomingMove+1);
        }
        if(r-1>= 0 && r-1 < chess.length && c-2>=0 && c-2<chess[0].length){
            printKnightsTour(chess,r-1,c-2,upcomingMove+1);
        }
        if(r-2>= 0 && r-2 < chess.length && c-1>=0 && c-1<chess[0].length){
            printKnightsTour(chess,r-2,c-1,upcomingMove+1);
        } 
        chess[r][c] = 0;

    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}