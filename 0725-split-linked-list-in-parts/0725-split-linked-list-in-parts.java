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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr = head;
        int len = 0;

        // Calculate the length of the linked list
        while (curr != null) {
            len++;
            curr = curr.next;
        }

        int minNodesPerPart = len / k;
        int extraNodes = len % k;

        ListNode[] result = new ListNode[k];
        curr = head;

        for (int i = 0; i < k; i++) {
            ListNode partHead = curr;
            ListNode prev = null;
            int partSize = minNodesPerPart + (i < extraNodes ? 1 : 0);

            for (int j = 0; j < partSize; j++) {
                prev = curr;
                if (curr != null) {
                    curr = curr.next;
                }
            }

            if (prev != null) {
                prev.next = null;
            }
            result[i] = partHead;
        }
        
        return result;
    }
}
