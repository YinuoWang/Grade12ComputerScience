public class MyBinaryTree {
    // attributes
    private StudentInfo root; // the root of the tree
    private int numInTree; // the number of students in the tree

    // constructor
    public MyBinaryTree(){
        root = null;
        numInTree = 0;
    }

    // getter method for the root of the tree
    public StudentInfo getRoot(){
        return root;
    }

    // getter method for the number of students in the tree
    public int getNumInTree(){
        return numInTree;
    }

    // method to add student to the tree
    public void addToTree(StudentInfo targetNode, StudentInfo itemToAdd){
        if (root == null){ // if there are no students in the tree
            root = itemToAdd; // set root to itemToAdd
            numInTree++;
        }
        else {
            if (itemToAdd.getStudentNum()<targetNode.getStudentNum()) { // go left
                if (targetNode.getLeft() == null){ // if there is no student to the left of the current student
                    targetNode.setLeft(itemToAdd); // set itemToAdd as a leaf node, left of current student
                    numInTree++;
                }
                else{
                    addToTree(targetNode.getLeft(), itemToAdd); // recurse down the tree leftwards
                }
            }
            else { // go right
                if (targetNode.getRight() == null){ // if there is no student to the right of the current student
                    targetNode.setRight(itemToAdd); // set itemToAdd as a leaf node, right of current student
                    numInTree++;
                }
                else{
                    addToTree(targetNode.getRight(), itemToAdd); // recurse down the tree rightwards
                }
            }
        }
    }

    // inorder traversal method
    public void inorder(StudentInfo targetNode){
        if (targetNode != null){
            inorder(targetNode.getLeft());
            System.out.println(targetNode.getStudentNum() + " ");
            inorder(targetNode.getRight());
        }
    }

    // preorder traversal method
    public void preorder(StudentInfo targetNode){
        if (targetNode != null){
            System.out.println(targetNode.getStudentNum() + " ");
            preorder(targetNode.getLeft());
            preorder(targetNode.getRight());
        }
    }

    // postorder traversal method
    public void postorder(StudentInfo targetNode){
        if (targetNode != null){
            postorder(targetNode.getLeft());
            postorder(targetNode.getRight());
            System.out.println(targetNode.getStudentNum() + " ");
        }
    }

}
