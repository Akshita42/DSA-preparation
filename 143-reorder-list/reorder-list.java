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
    private static ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid=getMid(head);
        ListNode secondHalf=mid.next;
        mid.next=null;
        secondHalf=reverse(secondHalf);
        ListNode leftHead=head;
        ListNode rightHead=secondHalf;
        ListNode nextLeft,nextRight;
        while(leftHead!=null && rightHead!=null){
            nextLeft=leftHead.next;
            leftHead.next=rightHead;
            nextRight=rightHead.next;
            rightHead.next=nextLeft;

            rightHead=nextRight;
            leftHead=nextLeft;
        }
    }
}