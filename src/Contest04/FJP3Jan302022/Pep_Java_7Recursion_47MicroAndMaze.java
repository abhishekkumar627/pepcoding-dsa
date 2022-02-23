package Contest04.FJP3Jan302022;

import java.io.*;
import java.util.*;

public class Pep_Java_7Recursion_47MicroAndMaze {
    static boolean isReached = false;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] maze = new int[n][m];
        for(int i = 0;i < n; i++){
            for(int j = 0 ;j < m;j++){
                maze[i][j] = scn.nextInt();
            }
        }        
        boolean isReached=getSolution(maze,0,0);
        if(isReached){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    //up,down,left,right
    //static int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};    
    private static boolean getSolution(int[][] maze , int sr, int sc){
        if(sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 0){
            return false;
        }
        if(sr == maze.length-1 && sc == maze[0].length-1){            
            return true;
        }
        
        maze[sr][sc] = 0;// marking index visited
        boolean op1 = getSolution(maze,sr-1,sc); // up
        boolean op2 = getSolution(maze,sr+1,sc); // down
        boolean op3 = getSolution(maze,sr,sc-1); // left
        boolean op4 = getSolution(maze,sr,sc+1); // right
        maze[sr][sc] = 1; // marking index unvisited for backtracking 
        return op1 || op2 || op3 || op4;
    }
}
