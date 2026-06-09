import java.util.*;
public class BinaryTree_1{
    static class Node{
        int data;
        Node left;
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
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left  = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        } 
    }
    //preorder traversal
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    //inorder traversal
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

//postorder traversal
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.right);
        postorder(root.left);
        System.out.print(root.data+ " ");
    }

    //level order traversal (binary search tree)
    public static void levelorder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){{
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
        }}
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
    //height of the tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh) +1;
    }
    //count of the tree
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return (leftCount + rightCount) +1;
    }
    //sum of the tree
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return (leftSum + rightSum ) + root.data;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildtree(nodes);
        BinaryTree_1 tree = new BinaryTree_1();
        
        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        // tree.levelOrder(root);
        // System.out.println(height(root));
        // System.out.println(count(root));
        System.out.println(sum(root));

    }
    
}