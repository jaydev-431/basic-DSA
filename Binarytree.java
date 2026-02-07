import java.util.*;
class Tree{
    static class Node{
        int data;
        Node left;
        Node right;
    
     Node (int data){
        this.data = data;
        this.left = null;
        this.right =null;
    
    }
    }
    static class Buildtree{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx ++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newnode = new Node(nodes[idx]);
        newnode.left = buildtree(nodes);
        newnode.right = buildtree(nodes);
        return newnode;
    }
    }
    public static void main(String args[]){
        int[] arr = {
    1,
    2,
    3, -1, -1,
    4, -1, -1,
    5,
    6, -1, -1,
    7,
    -1,
    8, -1, -1
};

        // build_tree m = new build_tree;
        // m.buildtree(arr);
        Buildtree tree = new Buildtree();
        Node root = tree.buildtree(arr);
        System.out.println("Tree built successfully");
        preorder(root);
        System.out.println();
        System.out.println("Inorder:");
        inorder(root);
         System.out.println();
        System.out.println("postorder:");
        postorder(root);
    }
    static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void postorder(Node root){
        if(root==null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    
}