import java.util.ArrayList;

public class MyHashTable {
    private ArrayList<StudentInfo>[] buckets;
    private int bucketCount;

    public MyHashTable(int k){
        bucketCount = k;
        buckets = new ArrayList[k];
        for (int i=0; i<k; ++i){
            buckets[i] = new ArrayList<>();
        }
    }

    public int calcBucketNum(int sNum){
        return sNum % bucketCount;
    }

    public void addStudent(StudentInfo studentToBeAdded){
        buckets[calcBucketNum(studentToBeAdded.getStudentNum())].add(studentToBeAdded);
    }

    public int searchStudent(StudentInfo studentToBeAdded){
        int bucketNum = calcBucketNum(studentToBeAdded.getStudentNum());
        return buckets[bucketNum].indexOf(studentToBeAdded);
    }

    public void removeStudent(StudentInfo studentToBeAdded){
        int position = searchStudent(studentToBeAdded);
        if (position == -1){
            System.out.println("No student was removed.");
        }
        else{
            buckets[calcBucketNum(studentToBeAdded.getStudentNum())].remove(position);
        }
    }

    public void printBuckets(){
        for (int i=0; i<bucketCount; ++i){
            System.out.print("In bucket " + i + " there is: ");
            for (int k=0; k<buckets[i].size(); ++k){
                System.out.print(buckets[i].get(k).getStudentNum() + " ");
            }
            System.out.println();
        }
    }
}
