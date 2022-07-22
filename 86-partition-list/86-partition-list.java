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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        ListNode temp = head;
        while(temp != null){
            int a = temp.val;
            if(a < x)
                arr.add(a);
            temp = temp.next;
        }
        temp = head;
        
        while(temp != null){
            int a = temp.val;
            if( a >=x)
                arr.add(a);
            temp = temp.next;
        }
        
        temp = head;
        int i=0;
        while(temp != null){
            temp.val = arr.get(i);
            i++;
            temp = temp.next;
        }
        
        return head;
    }
}