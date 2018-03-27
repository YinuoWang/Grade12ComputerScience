public class TestHashTable {
    public static void main(String[] args){
        MyHashTable myHT = new MyHashTable(2); // Defining and Instantiating a new HashTable

        // Adding 5 students to the HashTable
        StudentInfo test1 = new StudentInfo(1, "bob", "smith");
        StudentInfo test2 = new StudentInfo(2, "mike", "smith");
        StudentInfo test3 = new StudentInfo(3, "dan", "smith");
        StudentInfo test4 = new StudentInfo(4, "jim", "smith");
        StudentInfo test5 = new StudentInfo(5, "sam", "smith");
        myHT.addStudent(test1);
        myHT.addStudent(test2);
        myHT.addStudent(test3);
        myHT.addStudent(test4);
        myHT.addStudent(test5);
        myHT.printBuckets();
        System.out.println(myHT.searchStudent(4).getFirstName());   // Testing search student method
        System.out.println(myHT.removeStudent(1).getFirstName());   // Testing the removeStudent method
        System.out.println(myHT.removeStudent(6));                  // Testing case if student is not in the HashTable
    }
}
