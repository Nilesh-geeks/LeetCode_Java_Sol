Question ::876. Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
Solution::

Complexity::

Time complexity:
O(N) 

Space complexity:
O(1)

Code::
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
    public ListNode middleNode(ListNode head) {
         Let  slow  = head;
         Let  fast  = head;
        while(fast && fast.next){
            fast = fast.next.next;
            slow= slow.next;
        }
        return slow;
    }
}