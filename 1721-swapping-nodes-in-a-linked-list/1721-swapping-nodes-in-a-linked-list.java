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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        int temp = 0;

        for(int i = 1; i < k ; i++)
        {
            fast = fast.next;   //k from  first ki value miljayegi
        }

        ListNode store = fast;

        while(fast.next != null){
            slow= slow.next;
            fast = fast.next;
        }

        temp = slow.val;
        slow.val = store.val;
        store.val = temp;

        return head;  
    }
}