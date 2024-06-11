class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data=data;
    }
}

public class BinaryTree{
    TreeNode root;
    public void createBinaryTree(){
        root=new TreeNode(10);
        TreeNode second=new TreeNode(20);
        TreeNode third=new TreeNode(30);
        TreeNode fourth=new TreeNode(40);
        TreeNode fifth=new TreeNode(50);

    
        root.left=second;
        root.right=third; 
        second.left=fourth;
        second.right=fifth;
        /*
         
          inorder- [40,20,50],10,30

          preorder- [20,40,50]<--10-->30
                         
                    10,[20,40,50],30

          postorder- [40,50,20]<--10-->30

                     [40,50,20],30,10
         */
    }

    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void preOrder(TreeNode root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }    

    public void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.createBinaryTree();
        tree.inOrder(tree.root);
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }
}