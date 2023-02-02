package tree;

public class TreeTester {
  public static void main(String[] args) {
    Tree<Integer> tree = new Tree<>();

    System.out.println(tree);
    System.out.println("Contains 42: " + (tree.find(42) ? "yes" : "no"));

    tree.insert(42);
    tree.insert(100);
    tree.insert(20);
    tree.insert(10);
    tree.insert(35);
    tree.insert(200);
    tree.insert(1000);
    tree.insert(99);

    System.out.println(tree);
    System.out.println("Contains 42: " + (tree.find(42) ? "yes" : "no"));
    System.out.println("Contains 7: " + (tree.find(7) ? "yes" : "no"));

    System.out.println("PREORDER");
    tree.preorder();

    System.out.println("INORDER");
    tree.inorder();

    System.out.println("POSTORDER");
    tree.postorder();
  }
}
