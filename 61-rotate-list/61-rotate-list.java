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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        
        ListNode tail = head;
        int size = 1;
        
        while(tail.next != null){
            tail = tail.next;
            size++;
        }
        
        k = k%size;
        
        if(k == 0)
            return head;
    
        ListNode temp = head;
        
        for(int i=1;i<=k;i++){
            temp = temp.next;
        }
        
        ListNode newTail = head;
        
        while(temp.next != null){
            temp = temp.next;
            newTail = newTail.next;
        }
        
        ListNode newHead = newTail.next;
        
        newTail.next = null;
        temp.next = head;
        
        return newHead;
        
    }
}