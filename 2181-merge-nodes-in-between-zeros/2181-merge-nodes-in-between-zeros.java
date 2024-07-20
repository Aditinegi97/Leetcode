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
    public ListNode mergeNodes(ListNode head) {
        ListNode store = new ListNode(); 
        ListNode dump = store; 
        ListNode curr = head.next; 
        int sum = 0;
        
        while (curr != null) {
            if (curr.val == 0) {
                if (sum > 0) {
                    dump.next = new ListNode(sum);
                    dump = dump.next; 
                    sum = 0; 
                }
            } else {
                sum += curr.val; 
            }
            curr = curr.next; 
        }
        return store.next; 
    }
}
