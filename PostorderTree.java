class NODE{
    int key;
    NODE left,right;

NODE(int value){
    key = value;
    left=right=null;
}}
public class PostorderTree{
    public static void tree(NODE root){
        if(root==null){
            return;
        }
        //postorder
      tree(root.left);
        tree(root.right);
        System.out.println(root.key);
    }
    public static void main(String[]args){
        NODE root= new NODE(10);
         root.left =new NODE(20);
         root.right= new NODE(30);
         root.left.left = new NODE(40);
         root.left.right =new NODE(50);
         root.right.left= new NODE(60);
         root.right.right= new NODE(70);
        tree(root);
    }
}