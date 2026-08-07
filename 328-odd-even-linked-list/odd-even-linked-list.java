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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode temp=new ListNode(0);
        ListNode curr=head;
        ListNode Odd=dummy;
        ListNode Even=temp;
        int count=1;
        if(head==null) return null;
        while(curr!=null){
            if(count%2!=0){
                Odd.next=curr;
                curr=curr.next;
                Odd=Odd.next;
                count++;
            }
            else{
                Even.next=curr;
                curr=curr.next;
                Even=Even.next;
                count++;
            }
        }
        Even.next=null;
        Odd.next=temp.next;
        return dummy.next;
    }
}