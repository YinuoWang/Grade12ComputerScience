public class TestDB {
    public static void main (String[] args){
        MyHashTable myHT = new MyHashTable(2);
        EmployeeInfo pt1 = new PartTimeEmployee(1, 10, 30, 52);
        EmployeeInfo pt2 = new PartTimeEmployee(2, 10, 30, 52);
        EmployeeInfo pt3 = new PartTimeEmployee(3, 10, 30, 52);
        EmployeeInfo pt4 = new PartTimeEmployee(4, 10, 30, 52);
        EmployeeInfo pt5 = new PartTimeEmployee(5, 10, 30, 52);

        EmployeeInfo ft1 = new FullTimeEmployee(6, 1000);
        EmployeeInfo ft2 = new FullTimeEmployee(7, 1000);
        EmployeeInfo ft3 = new FullTimeEmployee(8, 1000);
        EmployeeInfo ft4 = new FullTimeEmployee(9, 1000);
        EmployeeInfo ft5 = new FullTimeEmployee(10, 1000);

        myHT.addEmployee(pt1);
        myHT.addEmployee(pt2);
        myHT.addEmployee(pt3);
        myHT.addEmployee(pt4);
        myHT.addEmployee(pt5);
        myHT.addEmployee(ft1);
        myHT.addEmployee(ft2);
        myHT.addEmployee(ft3);
        myHT.addEmployee(ft4);
        myHT.addEmployee(ft5);

        EmployeeInfo search1 = myHT.searchEmployee(2);
        if (search1 instanceof PartTimeEmployee){
            System.out.println(((PartTimeEmployee) search1).calcAnnualGrossIncome());
        }

        myHT.printBuckets();
    }
}
