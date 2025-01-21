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
    ArrayList<TreeNode> q = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, q);
        return q.get(k - 1).val;
    }

    public void inorder(TreeNode node, ArrayList<TreeNode> q) {
        if (node == null) {
            return;
        }
        inorder(node.left, q);
        q.add(node);
        inorder(node.right, q);
    }
}