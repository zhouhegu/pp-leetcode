package main.java.tree.traversal;

import main.java.common.PopulateParamUtil;
import main.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author gupp
 * @date 2022/7/23 20:08
 * 后续遍历
 */
public class PostOrder {
    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            LinkedList<TreeNode> stack1 = new LinkedList<>();
            LinkedList<TreeNode> stack2 = new LinkedList<>();
            stack1.push(root);
            while (!stack1.isEmpty()) {
                root = stack1.pop();
                stack2.push(root);
                if (root.left != null) {
                    stack1.push(root.left);
                }
                if (root.right != null) {
                    stack1.push(root.right);
                }
            }
            while (!stack2.isEmpty()) {
                list.add(stack2.pop().val);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = PopulateParamUtil.populateIsValidBSTParam();
        List<Integer> postOrderList = postOrderTraversal(root);
        System.out.println(postOrderList);
    }
}
