//Short Recurssive approch to solve below question

class Solution {

    public ListNode reverse(ListNode prev , ListNode curr){
        if(curr == null) {
            return prev;
        }
        ListNode frwd = curr.next;
        curr.next = prev;
        return reverse(curr,frwd);
    }
    public ListNode reverseList(ListNode head) {
        return reverse(null,head);
    }
}
