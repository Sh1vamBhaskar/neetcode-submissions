

//Recurssive approch to solve below question


class Solution {

    public ListNode reverse(ListNode prev , ListNode curr) {
        if(curr == null) {
            return prev;
        }
        ListNode frwd = curr.next;
        curr.next = prev;
        prev = curr;
        curr = frwd;

        return reverse(prev,curr); 
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode res = reverse(prev,curr); 
        return res;
    }
}
