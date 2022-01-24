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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carry = false;
        
        ListNode temp1 = l1,temp2 = l2;
        ListNode ans = new ListNode();
        ListNode temp3 = ans;
        
        while(temp1!= null && temp2!= null){
            int sum = temp1.val + temp2.val;
            
            if(carry){
                sum+=1;
                carry = false;
            }
            
            if(sum>=10){
                sum -= 10;
                carry = true;
            }
            
            temp3.val = sum;
            
            if(temp1.next!= null && temp2.next!= null){
            temp3.next = new ListNode();
            temp3 = temp3.next;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        ListNode temp4 = null;
        
        if(temp1 != null){
            temp4 = temp1;
        }else if( temp2 != null){
            temp4 = temp2;
        }
        
        while(temp4 != null){
            int sum = temp4.val;
            if(carry){
                sum += 1;
                carry = false;
            }
            
            if(sum >=10){
                sum -= 10;
                carry = true;
            }
            
            temp3.next = new ListNode();
            temp3 = temp3.next;
            temp3.val = sum;
            
            temp4 = temp4.next;
            
        }
        
        if(carry){
            temp3.next = new ListNode();
            temp3 = temp3.next;
            temp3.val = 1;
        }
        
        return ans;
    }
}