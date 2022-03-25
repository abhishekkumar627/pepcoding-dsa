package Contest05.FJP3TILLDP13FEB2022;

import java.util.ArrayList;
import java.util.Scanner;

public class PathOfASnake{
   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt(); // board length
        int M = scn.nextInt(); // Number of faces of dice

        System.out.println(count(N,M));
        System.out.println(paths(N, M));
        print(N,M);
        
    }
    

    public static int count(int N,int M){
        if(N == 0)
        {
            return 1;
        }
        int count = 0;
        for(int i = 1; i <= M; i++)
        {
            if((N-i)>=0)
            {
                int ans = count(N-i,M);
                count += ans;
            }
        }
        return count;
        
    }



    public static ArrayList<String> paths(int N,int M){
        if(N == 0)
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        ArrayList<String> retLis = new ArrayList<>();
        for(int i = 1; i <= M && i <= N; i++)
        {
            ArrayList<String> ansLis = paths(N-i,M);
            for(String ele : ansLis)
            {
                retLis.add(i+ele);
            }
        }
        return retLis;
    }

    public static void print(int N, int M){
        print(N, M, "");
    }

    public static void print(int N,int M, String ans){
        if(N == 0)
        {
            System.out.println(ans);
            return;
        }
        for(int i = 1; i <= M && i <= N; i++)
        {
            print(N-i, M, ans+i);
        }
    }

    
}