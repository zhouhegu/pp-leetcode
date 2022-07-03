package main.java.tree;

import main.java.common.PopulateParamUtil;

/**
 * @author gupp
 * @date 2022/7/3 18:03
 * 验证二叉搜索树
 * 二叉搜索树 考虑利用中序遍历
 */
public class IsValidBST {

    private static final IsValidBST instance = new IsValidBST();

    private long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (pre >= root.val) {
            return false;
        }
        pre = root.val;
        return isValidBST(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = PopulateParamUtil.populateIsValidBSTParam();
        System.out.println(instance.isValidBST(root));
    }
}
