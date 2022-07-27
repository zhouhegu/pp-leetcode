package main.java.tree.traversal;

import main.java.common.PopulateParamUtil;
import main.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gupp
 * @date 2022/7/25 23:22
 * Morris遍历可实现遍历二叉树只需O(1)空间复杂度
 */
public class Morris {

    public static List<Integer> morrisTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // 当前节点root的前驱节点
        TreeNode pred = null;
        while (root != null) {
            if (root.left == null) {
                list.add(root.val);
                root = root.right;
            } else {
                pred = root.left;
                while (pred.right != null && pred.right != root) {
                    pred = pred.right;
                }
                // 将pred的右指针指向当前的root节点，继续遍历左子树
                if (pred.right == null) {
                    pred.right = root;
                    root = root.left;
                // 左子树已经遍历完成，断开连接
                } else {
                    pred.right = null;
                    list.add(root.val);
                    root = root.right;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = PopulateParamUtil.populateIsValidBSTParam();
        List<Integer> inOrderList = morrisTraversal(root);
        System.out.println(inOrderList);
    }
}
