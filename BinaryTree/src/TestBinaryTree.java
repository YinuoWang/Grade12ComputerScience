public class TestBinaryTree {
    public static void main(String[] args) {
        MyBinaryTree theBT = new MyBinaryTree();
        theBT.addToTree(theBT.getRoot(), new StudentInfo(7, "Adam", "Apple"));
        theBT.addToTree(theBT.getRoot(), new StudentInfo(2, "Adam", "Apple"));
        theBT.addToTree(theBT.getRoot(), new StudentInfo(11, "Adam", "Apple"));
        theBT.addToTree(theBT.getRoot(), new StudentInfo(1, "Adam", "Apple"));
        theBT.addToTree(theBT.getRoot(), new StudentInfo(5, "Adam", "Apple"));
        theBT.addToTree(theBT.getRoot(), new StudentInfo(9, "Adam", "Apple"));
        theBT.addToTree(theBT.getRoot(), new StudentInfo(20, "Adam", "Apple"));
        theBT.addToTree(theBT.getRoot(), new StudentInfo(6, "Adam", "Apple"));
        theBT.addToTree(theBT.getRoot(), new StudentInfo(16, "Adam", "Apple"));
        theBT.addToTree(theBT.getRoot(), new StudentInfo(12, "Adam", "Apple"));

        System.out.print("The inorder traversal is: ");
        theBT.inOrder(theBT.getRoot());
        System.out.print('\n');
        System.out.print("The postorder traversal is: ");
        theBT.postOrder(theBT.getRoot());
        System.out.print('\n');
        System.out.print("The preorder traversal is: ");
        theBT.preOrder(theBT.getRoot());
        System.out.print('\n');
    }
}
