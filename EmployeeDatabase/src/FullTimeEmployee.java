public class FullTimeEmployee extends EmployeeInfo {
    private double yearlySalary;

    public FullTimeEmployee(){
        super();
    }

    public double calcAnnualGrossIncome(){
        return yearlySalary*(1-super.getDeductionRate());
    }
}
