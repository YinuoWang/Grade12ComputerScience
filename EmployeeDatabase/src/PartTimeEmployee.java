public class PartTimeEmployee extends EmployeeInfo {
    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;

    public PartTimeEmployee(int eN, double hW, double hPW, double wPY){
        super(eN);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
    }

    public double calcAnnualGrossIncome(){
        return (hourlyWage*hoursPerWeek*weeksPerYear);
    }

    public double calcAnnualNetIncome(){
        return (hourlyWage*hoursPerWeek*weeksPerYear)*(1-super.getDeductionRate());
    }
}
