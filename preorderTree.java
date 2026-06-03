class TreeNode{
    int key;
    TreeNode left,right;

TreeNode(int value){
    key = value;
    left=right=null;

}}
public class preorderTree{
    public static void preorder(TreeNode root){
        if(root==null){
            return;
        }
        //preorder
        System.out.println(root.key);
       preorder(root.left);
        preorder(root.right);
        
    }
    public static void main(String[]args){
         TreeNode root= new TreeNode(10);
         root.left =new TreeNode(20);
         root.right= new TreeNode(30);
         root.left.left = new TreeNode(40);
         root.left.right =new TreeNode(50);
         root.right.left= new TreeNode(60);
         root.right.right= new TreeNode(70);
         preorder(root);
    }
}