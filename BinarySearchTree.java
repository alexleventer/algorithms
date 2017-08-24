public class BinarySearchTree {
  private Node root;

  public BinarySearchTree() {
    root = null;
  }

  public boolean insert(int x) {
    return insert(int x, root);
  }
  private void insert(int x, Node tree) {
    if (tree == null)
      return new Node(x, null);
    else if (x < tree.value)
      tree.left = insert(x, tree.left);
    else
      tree.right = insert(x, tree.right);
  }

  public boolean contains(int x) {
    return contains(int x, root);
  }

  private boolean contains(int x, Node tree) {
    if (tree == null)
      return false;
    else if(x == tree.value)
      return true;
    else if (x > tree.value)
      return contains(x, tree.left);
    else
      return contains(x, tree.right);
  }

  public boolean empty() {
    return root == null;
  }

  private void getPreOrderTraversal(Node tree) {
    if (tree != null) {
      System.out.println(tree.value);
      getPreOrderTraversal(tree.left);
      getPreOrderTraversal(tree.right);
  }

   private void getInOrderTraversal(Node tree) {
    if (tree != null) {
      getPreOrderTraversal(tree.left);
      System.out.println(tree.value);
      getPreOrderTraversal(tree.right);
  }

   private void getPostOrderTraversal(Node tree) {
    if (tree != null) {
      getPreOrderTraversal(tree.left);
      getPreOrderTraversal(tree.right);
      System.out.println(tree.value);
  }
}