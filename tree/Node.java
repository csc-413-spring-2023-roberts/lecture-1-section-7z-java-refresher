package tree;

public class Node<T extends Comparable<T>> {
  private T dataValue;
  private Node<T> left, right;

  public Node(T data) {
    this.dataValue = data;
  }

  public void insert(T insertValue) {
    if (insertValue.compareTo(this.dataValue) < 0) {
      if (this.left == null) {
        this.left = new Node<T>(insertValue);
      } else {
        this.left.insert(insertValue);
      }
    } else {
      if (this.right == null) {
        this.right = new Node<T>(insertValue);
      } else {
        this.right.insert(insertValue);
      }
    }
  }

  public boolean find(T searchValue) {
    if (searchValue.compareTo(this.dataValue) == 0) {
      return true;
    } else if (searchValue.compareTo(this.dataValue) < 0) {
      return this.left != null && this.left.find(searchValue);
    } else {
      return this.right != null && this.right.find(searchValue);
    }
  }

  public void preorder() {
    System.out.print(this.dataValue + " ");

    if (this.left != null) {
      this.left.preorder();
    }
    if (this.right != null) {
      this.right.preorder();
    }
  }

  public void inorder() {
    if (this.left != null) {
      this.left.inorder();
    }

    System.out.print(this.dataValue + " ");

    if (this.right != null) {
      this.right.inorder();
    }
  }

  public void postorder() {
    if (this.left != null) {
      this.left.preorder();
    }
    if (this.right != null) {
      this.right.preorder();
    }

    System.out.print(this.dataValue + " ");
  }
}
