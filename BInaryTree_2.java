
import java.util.*;

public class BInaryTree_2 {
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

    static class BinaryTree{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1 ){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;

        }
    }
    //pre-order traversal
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //in-order traversal
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);

    }
    //post-order traversal
    public static void Postorder(Node root){
        if(root == null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }
    //level order traversal
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
            System.out.print(currNode.data+ " "); 
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
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BInaryTree_2 tree = new BInaryTree_2();
        Node root = BinaryTree.buildtree(nodes);
        
        BInaryTree_2.levelOrder(root);

    }
}
