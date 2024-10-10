

public class BST {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int value) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){}
    }
    
    public int min(TreeNode root){
        TreeNode curr = root;
        curr = curr.left;
        while(curr != null && curr.left != null){
            curr = curr.left;

        }


        return curr.val;
    }

    public int max(TreeNode root){
        TreeNode curr = root;
        curr = curr.right;
        while(curr != null && curr.right != null){
            curr = curr.right;

        }
        return curr.val;
    }

    public int height (TreeNode curr){
        if (curr == null){
            return 0;
        }

        int leftHeight = height(curr.left);
        int rightHeight = height(curr.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isBalanced(TreeNode root){
        int left = 0;
        int right = 0;
        if (root == null){
             left = height(root.left);
             right = height(root.right);
        }
        if(Math.abs(left - right) > 1){
            return false;
        }
        else if(!isBalanced(root.left) || !isBalanced(root.right)){
            return false;
        }
        return true;

    }
    public TreeNode sortedArrayToBST(int[] nums){
        





        return null;
    }
    public TreeNode helper(int[] nums, int s, int e){
        if (s>e){
            return null;

        }
        int mid = s+(e-s)/2;

        TreeNode node = new TreeNode(nums[mid]);

        return null;


    }
}
