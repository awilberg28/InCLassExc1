public class test {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int value) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){}
    }

    public TreeNode deleteNode(TreeNode root, int x){
        if (root == null){
            return root;
        }
        if (root.val > x) {
            root.left = deleteNode(root.left, x);

        }else if(root.val < x) {
            root.right = deleteNode(root.right, x);
        } else {
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{

                TreeNode replace = getSuccessor(root);
                root.val = replace.val;
                root.right = deleteNode(root.right, replace.val);
            }
        
        }

        return root;
    }
    public TreeNode getSuccessor(TreeNode curr){
        curr = curr.right;
        while(curr != null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
}
