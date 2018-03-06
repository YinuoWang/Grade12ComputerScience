public class MyBinaryTree {
    private StudentInfo root;
    private int numInTree;

    public MyBinaryTree(){
        root = null;
        numInTree = 0;
    }

    public StudentInfo getRoot(){
        return root;
    }

    public int getNum(){
        return numInTree;
    }

    public void addToTree(StudentInfo targetNode, StudentInfo itemToAdd){
        if (root == null){
            root = itemToAdd;
            numInTree++;
        }
        else {
            if (itemToAdd.studentNum<=targetNode.studentNum) { // go left
                if (targetNode.left == null){
                    targetNode.left = itemToAdd;
                    numInTree++;
                }
                else{
                    addToTree(targetNode.left, itemToAdd);
                }
            }
            else { // go right
                if (targetNode.right == null){
                    targetNode.right = itemToAdd;
                    numInTree++;
                }
                else{
                    addToTree(targetNode.right, itemToAdd);
                }
            }
        }
    }

    public void inOrder(StudentInfo targetNode){
        if (targetNode != null){
            inOrder(targetNode.left);
            System.out.print(targetNode.studentNum + " ");
            inOrder(targetNode.right);
        }
    }

    public void preOrder(StudentInfo targetNode){
        if (targetNode != null){
            System.out.print(targetNode.studentNum + " ");
            preOrder(targetNode.left);
            preOrder(targetNode.right);
        }
    }

    public void postOrder(StudentInfo targetNode){
        if (targetNode != null){
            postOrder(targetNode.left);
            postOrder(targetNode.right);
            System.out.print(targetNode.studentNum + " ");
        }
    }

}
