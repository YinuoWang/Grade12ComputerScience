public class TestBinaryTree {
    public static void main(String[] args) {
        // instantiating binary tree and students
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

        // showing the various traversals
        System.out.println("The inorder traversal is: ");
        theBT.inOrder(theBT.getRoot());
        System.out.println("The postorder traversal is: ");
        theBT.postOrder(theBT.getRoot());
        System.out.println("The preorder traversal is: ");
        theBT.preOrder(theBT.getRoot());
    }
}
