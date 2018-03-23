public class TestHashTable {
    public static void main(String[] args){
        MyHashTable myHT = new MyHashTable(2);
        StudentInfo test1 = new StudentInfo(1, "bob", "smith");
        StudentInfo test2 = new StudentInfo(2, "bob", "smith");
        StudentInfo test3 = new StudentInfo(3, "bob", "smith");
        StudentInfo test4 = new StudentInfo(4, "bob", "smith");
        StudentInfo test5 = new StudentInfo(5, "bob", "smith");
        myHT.addStudent(test1);
        myHT.addStudent(test2);
        myHT.addStudent(test3);
        myHT.addStudent(test4);
        myHT.printBuckets();
        myHT.removeStudent(test1);
        myHT.removeStudent(test5);
    }
}
