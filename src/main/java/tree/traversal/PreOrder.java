package main.java.tree.traversal;

import main.java.common.PopulateParamUtil;
import main.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author gupp
 * @date 2022/7/23 19:24
 * 前序遍历
 */
public class PreOrder {
    public static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (root != null) {
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode currentNode = stack.pop();
                list.add(currentNode.val);
                if (currentNode.right != null) {
                    stack.push(currentNode.right);
                }
                if (currentNode.left != null) {
                    stack.push(currentNode.left);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = PopulateParamUtil.populateIsValidBSTParam();
        List<Integer> preOrderList = preOrderTraversal(root);
        System.out.println(preOrderList);
    }
}
