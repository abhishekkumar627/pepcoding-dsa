package Contest06.FJP3Contest090322;

import java.util.Scanner;

public class DiagonalAndWaveTraversal {    
    
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int row =scn.nextInt();           
            int[][] arr = new int[row][row];
            for(int i=0;i<row;i++){
                for(int j=0;j<row;j++){
                    arr[i][j] = scn.nextInt();
                }
            }
            scn.close();
            printDiagonalMatrix(arr);
        }
        
        private static void printDiagonalMatrix(int[][] arr){
            int n = arr.length;
            int m = arr[0].length;
            int row=n-1; int col=0;
            boolean up = false;
            
            while(row >= 0 && col < m){
                if(up){
                    while(row > 0 && col > 0){
                        System.out.println(arr[row][col]);
                        row--;
                        col--;
                    }
                    if(row>=0 && col>=0){
                        System.out.println(arr[row][col]);
                        if(row==0){
                            col++;
                        }else{
                            row--;
                        }
                    }
                }else{
                    while( col < m-1 && row < n-1){
                        System.out.println(arr[row][col]);
                        row++;
                        col++;
                    }
                    if(row<=n-1 && col<=m-1){
                    System.out.println(arr[row][col]);                    
                        if(col==m-1){
                            row--;
                        }else{
                            col++;
                        }
                    }
                }
                up = !up;
                
            }
        }
    } 

