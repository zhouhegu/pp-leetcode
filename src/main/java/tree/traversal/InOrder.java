package main.java.tree.traversal;

import main.java.common.PopulateParamUtil;
import main.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author gupp
 * @date 2022/7/23 19:55
 * 中序遍历
 */
public class InOrder {
    public static List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = PopulateParamUtil.populateIsValidBSTParam();
        List<Integer> inOrderList = inOrderTraversal(root);
        System.out.println(inOrderList);
    }
}
