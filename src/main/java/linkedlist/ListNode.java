package main.java.linkedlist;

/**
 * @author gupp
 * @date 2022/6/30 00:24
 */
public class ListNode {

    int val;

    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
