import java.util.ArrayList;
import java.util.List;



public class InOrderTrav{

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int value) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){}
    }

    public List<Integer> InOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>(); 
    
        inorder(root,res);
        return res;
    }

    public void inorder(TreeNode node, List<Integer> res){
        if(node == null){
            return;
        }
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);

    }








}