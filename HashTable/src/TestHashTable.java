public class TestHashTable {
    public static void main(String[] args){

        // Defining and Instantiating HashTables
        MyHashTable myHT1 = new MyHashTable(2);
        MyHashTable myHT2 = new MyHashTable(3);

        // Adding 5 students to both HashTables
        StudentInfo test1 = new StudentInfo(1, "bob", "smith");
        StudentInfo test2 = new StudentInfo(2, "mike", "smith");
        StudentInfo test3 = new StudentInfo(3, "dan", "smith");
        StudentInfo test4 = new StudentInfo(4, "jim", "smith");
        StudentInfo test5 = new StudentInfo(5, "sam", "smith");
        myHT1.addStudent(test1);
        myHT1.addStudent(test2);
        myHT1.addStudent(test3);
        myHT1.addStudent(test4);
        myHT1.addStudent(test5);
        myHT2.addStudent(test1);
        myHT2.addStudent(test2);
        myHT2.addStudent(test3);
        myHT2.addStudent(test4);
        myHT2.addStudent(test5);

        // Testing printBuckets method
        myHT1.printBuckets();
        System.out.println();
        myHT2.printBuckets();
        System.out.println();

        System.out.println(myHT1.searchStudent(4).getFirstName());   // Testing search student method
        System.out.println(myHT2.removeStudent(1).getFirstName());   // Testing the removeStudent method
        System.out.println(myHT2.searchStudent(1));                  // Ensuring student was removed from MyHT2
        System.out.println(myHT1.removeStudent(6));                  // Testing case if student was never in the HashTable
    }
}
