public class BinarySearchTreeImplementation {
    class bs_node{
        int data;
        bs_node left;
        bs_node right;
        bs_node(int val){
            this.data = val;
            left = null;
            right = null;
        }
    }
    bs_node insert(bs_node root,int val){
        if(root == null){
            bs_node n = new bs_node(val);
            return n;
        }
        else if(val < root.data){
            root.left = insert(root.left, val);
        }
        else{
            root.right =insert(root.right, val);
        }
        return root;
    }
    void inorder(bs_node root){
        if(root == null){
            return;
        }
        else{
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BinarySearchTreeImplementation ob = new BinarySearchTreeImplementation();
        bs_node root = null;
        root = ob.insert(root, 5);
        ob.insert(root, 3);
        ob.insert(root, 4);
        ob.insert(root, 2);
        ob.insert(root, 1);
        System.out.print("The elements are :- ");
        ob.inorder(root);
    }
}
