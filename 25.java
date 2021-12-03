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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy, pre = dummy, nex = dummy;
        int len = 0;
        while(cur.next!=null){
            len++;
            cur = cur.next;
        }
        while(len>=k){
            cur = pre.next;
            nex = cur.next;
            for(int i=1;i<k;i++){
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            len -=k;
        }
        return dummy.next;
        
    }
}
