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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode rightplus = head;
        ListNode rightnode = head;
        ListNode leftnode = head;
        
        for(int i=1;i<left;i++)
            leftnode = leftnode.next;
        
        for(int i=1;i<right;i++)
            rightnode = rightnode.next;
        
        for(int i=1;i<right+1;i++)
            rightplus = rightplus.next;
        
        ListNode leftminus = new ListNode();
        leftminus.next = head;
        
        while(leftminus.next != leftnode)
            leftminus = leftminus.next;
        
        ListNode prev = leftminus;
        ListNode curr = leftnode;
        
        while(curr != rightplus){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        leftminus.next = rightnode;
        leftnode.next = rightplus;
        
        if(left == 1)
            return rightnode; 
        return head;
    }
}