class Node {
    int data;
    Node left, right;
    Node(int value) {
        data = value;
        left = right = null;
    }
}
public class BST {
    Node root;
    Node insert(Node root, int value) {
      if (root == null) {
           root = new Node(value);
           return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
      return root;
    }
    void inorder(Node root) {
        if (root != null) {
         inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 16);
        tree.insert(tree.root, 43);
        tree.insert(tree.root, 75);
        tree.insert(tree.root, 22);
        tree.insert(tree.root, 45);
        tree.insert(tree.root, 62);
        tree.insert(tree.root, 83);
        System.out.println("Inorder Traversal of BST:");
        tree.inorder(tree.root);
    }
}