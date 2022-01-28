package Contest03;
import java.util.Scanner;
public class SonuVsMonu{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i]= scn.nextInt();
        }
        boolean result = sonuVsMonu(nums);
        System.out.println(result);
    }

    private static boolean sonuVsMonu(int[] nums){
        int sonu=0;
        int monu=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sonu = sonu + nums[i];
            }else{
                monu = monu + nums[i];
            }
        }
        return (sonu>=monu)? true: false;
    }
}