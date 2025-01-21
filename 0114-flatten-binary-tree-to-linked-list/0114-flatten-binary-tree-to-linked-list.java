/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    Queue<TreeNode> q = new LinkedList<>();
    public void flatten(TreeNode root) {
        preorder(root, q);
        if (root==null)return;
        if(root.left==null && root.right==null)return;
        TreeNode currNode = root;
        while (!q.isEmpty()) {
            currNode.left = null;
            currNode.right = q.poll();
            currNode=currNode.right;
        }
    }

    public void preorder(TreeNode node,Queue<TreeNode> q) {
        if (node == null) {
            return;
        }
        q.add(node);
        preorder(node.left,q);
        preorder(node.right,q);
    }
}