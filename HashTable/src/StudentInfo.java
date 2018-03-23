public class StudentInfo {
    // Attributes
    private int studentNum;
    private String firstName, lastName;

    // Constructors
    public StudentInfo() {
        studentNum = -1;
        firstName = "";
        lastName = "";
    }

    public StudentInfo(int sN, String fN, String lN) {
        studentNum = sN;
        firstName = fN;
        lastName = lN;
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

    public void setStudentNum(int sN){
        if (sN<0){
            studentNum = 0;
        }
        else{
            studentNum = sN;
        }
    }
}
