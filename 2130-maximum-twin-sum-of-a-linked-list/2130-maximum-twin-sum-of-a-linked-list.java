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
    public int pairSum(ListNode head) {
        if(head == null || head.next==null ){
            return 0;
        }

        ListNode slow = head;
        ListNode fast = head; 

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        ListNode next = null;

        while( curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr; // naya head
            curr = next;
        }

        ListNode Firstlist = head ;
        ListNode Secondlist = prev;
        int maxtwinSum = 0;

        while (Secondlist != null){
            maxtwinSum = Math.max(maxtwinSum , Firstlist.val + Secondlist.val );
            Firstlist = Firstlist.next;
            Secondlist= Secondlist.next;
        }
        return maxtwinSum;
    }
}