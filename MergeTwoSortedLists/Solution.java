package MergeTwoSortedLists;

//  You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists into one sorted list. The list should be made by splicing together
// the nodes of the first two lists.
// Return the head of the merged linked list.

 //Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode current = new ListNode();
        
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
       
            ListNode result = new ListNode();
            current = result;
        while(list1!=null && list2 != null){
             if(list1.val <= list2.val ){
                current.next = list1;
                list1 = list1.next;
            }
            else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if(list1 != null){
            current.next = list1;
        }
        else{
            current.next=list2;
        }
        return result.next;
        
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);
        ListNode list3 = new ListNode(2);
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(3);
        ListNode list6 = new ListNode(4);
        list1.next=list3;
        list3.next=list4;
        list4.next=null;
        list2.next=list5;
        list5.next= list6;
        list6.next=null;
        ListNode result = sol.mergeTwoLists(list1,list2);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
