package LeetCode.LinkedList;

//Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode sortList(ListNode head) {
        if(head ==null || head.next == null){
            return head;
        }
        ListNode mid = getMidNode(head);
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(mid);
        return mergeTwoLists(l1,l2);
    }
    
    private ListNode getMidNode(ListNode head) {
        ListNode midPrev = null;  
        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
         ListNode mid = midPrev.next;
         midPrev.next = null;
        return mid;
    }

    ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode();
        ListNode currentHead = dummyHead;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                currentHead.next = list1;
                list1 = list1.next;
                currentHead = currentHead.next;
            }else {
                currentHead.next = list2;
                list2 =list2.next;
                currentHead = currentHead.next;
            }
        }
        currentHead.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }     
}