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
        ListNode last = head;
        ListNode dummy = new ListNode();
        dummy.next = null;
        
        if(head == null)
            return null;
        
        while(last.next != null){
            last = last.next;
        }
        reverser(dummy,head);
        head.next = null;
        return last;
    }
    
    void reverser(ListNode prev,ListNode curr){
        if(curr.next == null){
            curr.next = prev;
            return;
        }
        
        reverser(curr,curr.next);
        
        curr.next = prev;
    }
}