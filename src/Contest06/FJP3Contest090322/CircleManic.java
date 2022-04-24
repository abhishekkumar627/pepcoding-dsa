package Contest06.FJP3Contest090322;

import java.util.Scanner;

public class CircleManic {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] first = scn.nextLine().split(" ");
        String[] second = scn.nextLine().split(" ");
        int x1 = Integer.parseInt(first[0]);
        int y1 = Integer.parseInt(first[1]);
        int x2 = Integer.parseInt(second[0]);
        int y2 = Integer.parseInt(second[1]);
        int r1 = scn.nextInt();
        int r2 = scn.nextInt();
        scn.close();
        circlemanic(x1,x2,y1,y2,r1,r2);
    }
    
    private static void circlemanic(int x1,int x2, int y1, int y2, int r1, int r2){
        int distSq = Math.abs((x1 - x2)) * Math.abs((x1 - x2)) + Math.abs((y1 - y2)) * Math.abs((y1 - y2));
        int radSum = (r1 + r2) * (r1 + r2);
        int smaller = r1 < r2 ? r1 : r2;
        int bigger = r1< r2 ? r2 : r1;
        int overlap = distSq + smaller;
        if(overlap < bigger && distSq!=0){
            System.out.println ( "overlaps");
        }else if(x1==x2 && y1 ==y2 && r1!=r2){
             System.out.println ( "concentric");
        }else if(distSq == radSum){
                System.out.println ( "touches at 1 point");
        }else if(distSq < radSum){
                System.out.println ( "touches at 2 point");
        }else if(distSq > radSum){
                System.out.println ( "far-apart");
        }
    }
}