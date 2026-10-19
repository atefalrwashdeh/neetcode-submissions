/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode newNode = head;
       if(newNode.next !=null){
           newNode = reverseList(newNode.next);
            head.next.next = head; //reverse magic
            head.next = null;
       }
        return newNode;
        
    }
}
