public class PartTimeEmployee extends EmployeeInfo {
    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;

    public PartTimeEmployee(){
        super();
    }

    public double calcAnnualGrossIncome(){
        return (hourlyWage*hoursPerWeek*weeksPerYear)*(1-super.getDeductionRate());
    }
}
