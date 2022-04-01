import java.io.*;
import java.util.*;

public class MergeKSortedLists {

   //compareTo -- Comparable class 
   public static class Triplet implements Comparable<Triplet>{
      int li;  // list index
      int elementIndex; // which element in a list
      int value; // element in list with value

      Triplet(){

      }

      Triplet(int li, int elementIndex, int value){
         this.li = li;
         this.elementIndex = elementIndex;
         this.value = value;
      }

      public int compareTo(Triplet o){
         return this.value - o.value;
      }
   } 

   public static ArrayList<Integer> mergeKSortedLists1(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();
      PriorityQueue<Integer> pq = new PriorityQueue<>();

      for(int i=0;i<lists.size();i++){
         ArrayList<Integer> currentList = lists.get(i);
         for(int j=0;j<currentList.size();j++){
            pq.add(currentList.get(j));
         }
      }

      while(pq.size()!=0){
         rv.add(pq.remove());
      }      

      return rv;
   }

   public static ArrayList<Integer> mergeKSortedLists2(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();
      PriorityQueue<Triplet> pq = new PriorityQueue<>();

      for(int i=0;i<lists.size();i++){
         ArrayList<Integer> currentList = lists.get(i);         
         Triplet triplet = new Triplet(i,0,currentList.get(0));
         pq.add(triplet);
      }

      while(pq.size()>0){
         Triplet top = pq.remove();
         rv.add(top.value);

         int newLi = top.li;
         int newElementIndex = top.elementIndex+1;
         if(lists.get(newLi).size() > newElementIndex){
            int newValue = lists.get(newLi).get(newElementIndex);
            Triplet newoB = new Triplet(newLi,newElementIndex,newValue);
            pq.add(newoB);
         }        
      }
      return rv;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists2(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}
