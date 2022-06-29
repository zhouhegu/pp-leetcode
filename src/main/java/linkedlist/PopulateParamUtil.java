package main.java.linkedlist;

/**
 * @author gupp
 * @date 2022/6/30 00:27
 * 构建题目入参的公共类
 */
public class PopulateParamUtil {

    /**
     * 206反转链表入参
     */
    public static ListNode populateReverseListParam() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        return head;
    }
}
