public class CreateBinaryTree {
    public static TreeNode createBinaryTree(int arr[],TreeNode root, int i){
        if(i<arr.length){
         TreeNode temp=new TreeNode(arr[i]);
         root=temp;
         root.left=createBinaryTree(arr, root.left, 2*i+1);
         root.right=createBinaryTree(arr, root.right, 2*i+2);
        }
        return root;
     }

     public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        tree.root=createBinaryTree(arr, tree.root, 0);
        tree.inOrder(tree.root);
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
     }
}
