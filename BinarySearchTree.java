public class BinarySearchTree {
  private void insert(int x, Node tree) {
    if (tree == null)
      return new Node(x, null);
    else if (x < tree.value)
      tree.left = insert(x, tree.left);
    else
      tree.right = insert(x, tree.right);
  }
}