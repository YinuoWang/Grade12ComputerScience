public class StudentInfo {
    // Attributes
    public int studentNum;
    public String firstName, lastName;
    public StudentInfo left, right;

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
}
