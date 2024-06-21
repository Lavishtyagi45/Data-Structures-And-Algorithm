public class MinimumDepth {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public int minDepth(Node root) {
        // code here
        if (root == null) {
            return 0;
        }
        // it help to return min value other than null
        // if node is null then its value is Integer.MAX_VALUE help to return min value instead of 0
        int ld = (root.left != null) ? minDepth(root.left) : Integer.MAX_VALUE;  
        int rd = (root.right != null) ? minDepth(root.right) : Integer.MAX_VALUE;

        // both child of root are null then return its depth as 1
        if (ld == Integer.MAX_VALUE && rd == Integer.MAX_VALUE) {
            return 1;
        }

        // depth of node = min depth of child +1
        int minDepth = Math.min(ld, rd) + 1;
        return minDepth;
    }

    public static Node createBinaryTree(int arr[], Node root,int i) {
        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            if(temp.data==-1){
                root = null;
                return root;
            }
            root=temp;
            root.left = createBinaryTree(arr, root.left, 2 * i + 1);
            root.right = createBinaryTree(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    public void inorder(Node root){
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        MinimumDepth min = new MinimumDepth();
        int nodes[] = { 1, 3, 1, 2, -1, 1, 2, 2, 4, -1, 3, 2, 1, 1, -1, 1, 1, 3, 1, -1, 1, 2, 2, 1 };
        Node root = createBinaryTree(nodes,null,0);
        min.inorder(root);
        System.out.println(min.minDepth(root));
    }
}
