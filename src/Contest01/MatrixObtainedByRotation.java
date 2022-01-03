import java.util.Scanner;

class MatrixObtainedByRotation{
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);       
       int n1 = scn.nextInt();
       int m1 = scn.nextInt();
       int[][] arr1 =new int[n1][m1];
       for(int i=0;i<n1;i++){
        for(int j=0;j<m1;j++){
           arr1[i][j]=scn.nextInt();
       }
    }

       int n2 = scn.nextInt();
       int m2 = scn.nextInt();
       int[][] arr2 =new int[n2][m2];
       for(int i=0;i<n2;i++){
        for(int j=0;j<m2;j++){
           arr2[i][j]=scn.nextInt();
       }
    }
      
       boolean isMatching = isMatchingArrays(arr1,arr2);
       System.out.println(isMatching);
    }

    private static boolean isMatchingArrays(int[][] arr1, int[][] arr2) {
        int n=3;
        boolean isMatching =  compare(arr1,arr2);
        if(isMatching){
            return isMatching;
        }
        while(n>0){
            transpose(arr2);
            reverse(arr2);
            display(arr2);
            isMatching =  compare(arr1,arr2);
            if(isMatching){
                break;
            }
            n--;
        }
        return isMatching;
    }

    private static boolean compare(int[][] arr1, int[][] arr2) {
        if(arr1[0].length!=arr2[0].length){
            return false;
        }
        boolean isAllElementsMatched = true;
       outer: for(int i = 0; i < arr1.length; i++){
                 for(int j = 0; j < arr1[0].length ; j++){
                   if(arr1[i][j]!=arr2[i][j]){
                      isAllElementsMatched = false;
                      break outer;
                   }
              }            
         }
        return isAllElementsMatched;
    }

    public static void transpose(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length ; j++){
                int temp = arr[i][j];
                arr[i][j]  = arr[j][i];
                arr[j][i]  = temp;
            }            
        }
    }

    public static void reverse(int[][] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int li=0,ri=n-1;
            while(li<=ri){
                int temp = arr[i][li];
                arr[i][li]  = arr[i][ri];
                arr[i][ri]  = temp;

                li++;
                ri--;
            }            
        }
    }

    public static void display(int[][] arr){      
        System.out.println();  
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}