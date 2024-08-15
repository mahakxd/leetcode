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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null ){
            return head;
            
        }
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middle(head);
        ListNode rev=reverse(mid);
        ListNode left=head;
        ListNode right=rev;
        while(right!=null){
            if(left.val!=right.val){
                return false;

            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
}