package Contest05.FJP3TILLDP13FEB2022;

import java.util.Scanner;

public class WarMines {
    static int minRun = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        changeArr(arr,n,m);
        // printArr(arr);
        ans(arr, n, m);
        scn.close();
    }
    
    public static void printArr(int arr[][])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                if(arr[i][j] == -1)
                    System.out.print(" "+arr[i][j]+" || ");
                else
                    System.out.print("  "+arr[i][j]+" || ");
            }
            System.out.print("\n");
            for(int j = 0; j < arr.length*7 + 2; j++)
            {
                System.out.print("-");
            }
            System.out.print("\n");
        }
    }

    public static void changeArr(int arr[][], int n, int m)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(arr[i][j] == 0)
                {
                    if(j+1 != m)
                    {
                        arr[i][j+1] = -1;
                    }
                    if(j != 0)
                    {
                        arr[i][j-1] = -1;
                    }
                    if(i != 0)
                    {
                       arr[i-1][j] = -1;
                    }
                    if(i+1 != n)
                    {
                        arr[i+1][j] = -1;
                    }
                }
            }
        }
    }

    public static void ans(int arr[][], int r, int c)
    {
        for(int i = 0; i < r; i++)
        {
            warmines(arr, i, 0, 0);
        }
        if(minRun == Integer.MAX_VALUE)
        {
            System.out.print("soldier:KIA");
            return;
        }
        System.out.print(minRun);
    }
    
    public static void warmines(int[][] maze, int sr, int sc, int count){
        if(sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == -1 || maze[sr][sc] == 0 || count >= minRun)
        {
            return;
        }
        if(sc == maze[0].length-1)
        {
            if(count < minRun)
            {
                minRun = count;
            }
            return;
        }
        maze[sr][sc] = -1;
        warmines(maze,sr,sc+1,count+1);
        warmines(maze,sr-1,sc,count+1);
        warmines(maze,sr+1,sc,count+1);
        warmines(maze,sr,sc-1,count+1);
        maze[sr][sc] = 1;
    }
}
