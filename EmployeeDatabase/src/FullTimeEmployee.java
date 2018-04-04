public class FullTimeEmployee extends EmployeeInfo {
    private double yearlySalary;

    public FullTimeEmployee(int eN, double yS){
        super(eN);
        yearlySalary = yS;
    }

    public double calcAnnualGrossIncome(){
        return yearlySalary;
    }

    public double calcAnnualNetIncome(){
        return yearlySalary*(1-super.getDeductionRate());
    }
}
