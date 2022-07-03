package main.java.common;

import main.java.linkedlist.ListNode;
import main.java.tree.TreeNode;

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

    /**
     * 98验证二叉搜索树
     */
    public static TreeNode populateIsValidBSTParam() {
        TreeNode root = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(4);
        root.left = node2;
        root.right = node3;
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        node3.left = node4;
        node3.right = node5;
        return root;
    }
}
