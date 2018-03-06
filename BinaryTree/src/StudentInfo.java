public class StudentInfo {
    // Attributes
    private int studentNum;
    private String firstName, lastName;
    private StudentInfo left, right; // references to the left and right students of each student in the binary tree

    // Constructors
    public StudentInfo() {
        studentNum = -1;
        firstName = "";
        lastName = "";
        // By default, don't point to other students
        left = null;
        right = null;
    }

    public StudentInfo(int sN, String fN, String lN) {
        studentNum = sN;
        firstName = fN;
        lastName = lN;
        // By default, don't point to other students
        left = null;
        right = null;
    }

    // getter and setter methods for private attributes
    public int getStudentNum() {
        return studentNum;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public StudentInfo getLeft(){
        return left;
    }

    public StudentInfo getRight() {
        return right;
    }

    public void setStudentNum(int sN){
        if (sN<0){
            studentNum = 0;
        }
        else{
            studentNum = sN;
        }
    }

    public void setLeft(StudentInfo student){
        left = student;
    }

    public void setRight(StudentInfo student){
        right = student;
    }
}
