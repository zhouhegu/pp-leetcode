package main.java.linkedlist;

/**
 * @author gupp
 * @date 2022/6/30 00:24
 */
public class ReverseList {

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    public static void main(String[] args) {
        ListNode head = PopulateParamUtil.populateReverseListParam();
        ListNode reversedNode = reverseList(head);
    }
}
