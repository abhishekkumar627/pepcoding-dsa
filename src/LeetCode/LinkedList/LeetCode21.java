/** 21. Merge Two Sorted Lists
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
package LeetCode.LinkedList;
//import java.util.*;
public class LeetCode21 { 

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {       
        if(list1 == null) { 
            return list2; 
        } else if(list2 == null) {
            return list1;
        }        

        ListNode sortedHead = new ListNode();
        ListNode currentHead = sortedHead;       

        while(list1 != null &&  list2 != null){
            if(list1.val<list2.val){ 
                currentHead.next = list1;
                list1 = list1.next;
            }
            else {
                currentHead.next = list2;
                list2 = list2.next;
            }
            currentHead = currentHead.next;
        }

        while(list1!=null){
            currentHead.next = list1;
            list1 = list1.next;
            currentHead = currentHead.next;
        }

        while(list2!=null){
            currentHead.next = list2;
            list2 = list2.next;
            currentHead = currentHead.next;
        }
        
        return sortedHead.next;                
    }
}