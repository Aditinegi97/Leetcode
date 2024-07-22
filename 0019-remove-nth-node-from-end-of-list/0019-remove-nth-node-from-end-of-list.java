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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Create a dummy node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        // Step 2: Initialize pointers
        ListNode ptr1 = dummy;
        ListNode ptr2 = dummy;

        // Step 3: Move ptr2 n steps ahead
        for (int i = 1; i <= n; i++) {
            ptr2 = ptr2.next;
        }

        // Step 4: Move both pointers until ptr2 reaches the end
        while (ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        // Step 5: Remove the nth node
        ptr1.next = ptr1.next.next;

        return dummy.next;
    }
}







    