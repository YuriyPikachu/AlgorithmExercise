package yuliang.algorithm.demo;


/**
 * @author YuLiang
 * update  2022/10/23
 * <a href="YuriyPikachu@163.com">Contact me</a>
 * LeetCode  17.12题
 */
public class Binode {
    static TreeNode head = new TreeNode(-1);   // 为了返回单向链表的头节点而多设的一个节点
    static TreeNode pre = head;               // 指向当前节点的前一个节点

    public static void main(String[] args) {
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode6 = new TreeNode(6);
        treeNode4.left = treeNode2;
        treeNode4.right = treeNode5;
        treeNode5.right = treeNode6;
        treeNode2.left = treeNode1;
        treeNode1.left = treeNode0;
        treeNode2.right = treeNode3;

        TreeNode treeNode = convertBiNode(treeNode4);
    }

    public static TreeNode convertBiNode(TreeNode root) {
        inOrder(root);
        System.out.println("head.righ:");
        return head.right;
    }

    public static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println("root:" + root.val);
        pre.right = root;
        pre = root;
        root.left = null;
        System.out.println("pre right:"+ pre.right);
        inOrder(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
