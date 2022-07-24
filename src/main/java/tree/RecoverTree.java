package main.java.tree;

import main.java.common.PopulateParamUtil;

import java.util.LinkedList;

/**
 * @author gupp
 * @date 2022/7/17 16:56
 * 99.恢复二叉搜索树
 */
public class RecoverTree {

    public static void recoverTree(TreeNode root) {
        // pred为中序遍历到的最后一个节点
        TreeNode pred = null, x = null, y = null;
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pred != null && pred.val > root.val) {
                y = root;
                if (x == null) {
                    x = pred;
                } else {
                    break;
                }
            }
            pred = root;
            root = root.right;
        }
        swap(x, y);
    }

    private static void swap(TreeNode x, TreeNode y) {
        int temp = x.val;
        x.val = y.val;
        y.val = temp;
    }

    public static void main(String[] args) {
        TreeNode root = PopulateParamUtil.populateRecoverTree();
        System.out.println(root);
        recoverTree(root);
        System.out.println(root);
    }
}
