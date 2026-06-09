
import java.util.*;

public class BInarytreeB {
    static class Node{
        
        int data;
        Node left ;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }   
    }
    static class Binarytree{
        //here we are building the tree 
        static int idx= -1;
        public static Node buildTree(int nodes[]){
            idx++;

            if(nodes[idx] == -1){
                return  null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    public static void preOrder(Node root){
        //this functions is only for preorder traversal in tree
        if(root == null){//base case
            return;
        }
        System.out.print(root.data+ " ");//root 1st
        preOrder(root.left);//left subtree at 2nd 
        preOrder(root.right);//at last right subtree 

    }
    public static void inOrder(Node root){
        //this is the functions for inorder traversal in tree
        if(root == null){//base case
            return;
        }
        inOrder(root.left);//left subtree 1st
        System.out.print(root.data+ " ");//root 2nd
        inOrder(root.right);//then at last right subtree

    }
    public static void postorder(Node root){
        // this is the functions only for post order traversal in tree 
        if(root == null){///base case
            return;
        }
        postorder(root.left);//left subtree 1st
        postorder(root.right);//right subtree 2nd
        System.out.print(root.data+ " ");//then at the last root
    }
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();

            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data + " ");

                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args){
        int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
    

        Node root = tree.buildTree(Nodes);
        // System.out.println(root.data);
        levelOrder(root);

        
    }
}
