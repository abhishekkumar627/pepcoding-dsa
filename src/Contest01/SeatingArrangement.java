import java.util.Scanner;

public class SeatingArrangement {
    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       
       int n = scn.nextInt();
       int[] arr =new int[n];
       for(int i=0;i<n;i++){
           arr[i]=scn.nextInt();
       }
       int no = scn.nextInt();
       int val=seatingArrangement(arr,no);
       System.out.println(val);
    }

    private static int seatingArrangement(int[] arr, int no) {
        int li=0,ri=arr.length-1;        
        while(li<=ri){
            int  mid = (li+ri)/2;
            if(arr[mid]==no){
                return mid;
            }else if(arr[mid]>no){
                ri = mid-1;
            }else{
                li=mid+1;
            }
        }
        return li;
    }
}
