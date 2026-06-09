public class Binarytree{
    static class Node{//here we are declaring the nodes
        int data;
        Node left ;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        static class BinaryTree{//starting the  ain binary tree pree order traversal
            static int idx = -1;
            public static Node BuildTree(int nodes[]){
                idx++;
                if(nodes[idx] == -1){
                    return null;
                }
                Node newNode = new Node(nodes[idx]);

                Binarytree.Node left = BuildTree(nodes);
                Binarytree.Node right = BuildTree(nodes);

                return newNode;
                
            }
        }
        public static void main(String[] args){
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

            BinaryTree tree = new BinaryTree();
            Node root = tree.BuildTree(nodes);
            System.out.println(root.data);
        }
    }

    public static BinaryTree_1.Node buildtree(int[] nodes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildtree'");
    }
}