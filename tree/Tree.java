package tree;

public class Tree<T extends Comparable<T>> {
  private Node<T> root;
  private int size;

  public Tree() {
    this.root = null;
    this.size = 0;
  }

  public void insert(T insertValue) {
    if (root == null) {
      this.root = new Node<T>(insertValue);
    } else {
      this.root.insert(insertValue);
    }

    size++;
  }

  public boolean find(T searchValue) {
    return root != null && root.find(searchValue);
  }

  public void preorder() {
    if (this.root == null) {
      return;
    }

    this.root.preorder();
    System.out.println();
  }

  public void inorder() {
    if (this.root == null) {
      return;
    }

    this.root.inorder();
    System.out.println();
  }

  public void postorder() {
    if (this.root == null) {
      return;
    }

    this.root.postorder();
    System.out.println();
  }

  @Override
  public String toString() {
    return String.format("Tree with [%d] children.", this.size);
  }
}
