package main.java.linkedlist;

import main.java.common.PopulateParamUtil;

/**
 * @author gupp
 * @date 2022/6/30 00:24
 */
public class ReverseList {

    /**
     * 递归解法
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    /**
     * 非递归解法
     */
    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null, cur = head, next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = PopulateParamUtil.populateReverseListParam();
        ListNode reversedNode = reverseList(head);

    }
}
