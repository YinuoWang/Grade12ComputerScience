public class StudentInfo{

    // Attributes
    public int studentNumber;
    public String firstName, lastName;
    public StudentInfo nextStudent;
    
    // Constructors
    public StudentInfo() {
	studentNumber = -1; 
	firstName = "";
	lastName = "";
	nextStudent = null; // By default, don't point to another student
    }
    
    public StudentInfo(int sN, String fN, String lN) {
	studentNumber = sN;
	firstName = fN;
	lastName = lN;
	nextStudent = null; // By default, don't point to another student
    }
}
