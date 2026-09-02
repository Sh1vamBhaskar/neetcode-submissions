
//Recurssive approch to solve below question

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head ;

        while(curr != null) {
            ListNode frwd = curr.next;
            curr.next = prev;

            prev = curr;
            curr = frwd;

        }

        return prev;
        
    }
}
