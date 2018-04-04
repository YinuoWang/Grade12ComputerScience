public class EmployeeInfo {
    private int employeeNum;
    private String firstName;
    private String lastName;
    private int sex;
    private int workLocation;
    private double deductionRate;

    public EmployeeInfo(int eN){
        employeeNum = eN;
    }

    public double getDeductionRate(){
        return deductionRate;
    }

    public int getEmployeeNum(){
        return employeeNum;
    }
}
