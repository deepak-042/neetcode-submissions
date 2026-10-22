/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        while(queue.size() >0){
            int count = queue.size();
            for(int i = 0; i< count; i++){
                TreeNode node = queue.remove();
                list.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
        }
        PriorityQueue<Integer> minheap = new PriorityQueue<>(
            Collections.reverseOrder()
        );
        for(int i = 0; i< list.size();i++){
            minheap.add(list.get(i));
        }
        while(minheap.size() > k){
            minheap.poll();
        }
        return minheap.peek();

    }
}
