import java.util.Stack;

public class Solution {

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;


        while(curr != null){
            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }




        return null;
    }



    public class ListNode {
        int val;
        ListNode next;
        Stack stack = new Stack();

        public ListNode(){}



        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val; this.next = next;


        }
        }

}