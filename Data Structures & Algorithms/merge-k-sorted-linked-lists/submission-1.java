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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return mergedKListHelper(lists, 0, lists.length - 1);
    }
    ListNode mergedKListHelper(ListNode[] lists, int left, int right){
        if (lists == null || left > right) return null;
        if (left == right) return lists[left];
        int mid = left + (right - left) / 2;
        ListNode l1 = mergedKListHelper(lists, left, mid);
        ListNode l2 = mergedKListHelper(lists, mid + 1, right);
        return mergeTwoLists(l1, l2);
    }
    //To merge numbers togather
    ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dmmy = new ListNode();
        ListNode current = dmmy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }
        if (dmmy == null) {
            return null;
        }
        return dmmy.next;


    }

}