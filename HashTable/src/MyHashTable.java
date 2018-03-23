import java.util.ArrayList;

public class MyHashTable {
    private ArrayList<ArrayList<StudentInfo>> buckets;
    private int bucketCount;

    public MyHashTable(int k){
        bucketCount = k;
        buckets = new ArrayList<ArrayList<StudentInfo>>(k);
        for (int i=0; i<k; ++i){
            buckets.add(new ArrayList<StudentInfo>(k));
        }
    }

    public int calcBucketNum(int sNum){
        return sNum % bucketCount;
    }

    public void addStudent(StudentInfo studentToBeAdded){
        buckets.get(calcBucketNum(studentToBeAdded.getStudentNum())).add(studentToBeAdded);
    }

    public void removeStudent(StudentInfo studentToBeAdded){
        int bucketNum = calcBucketNum(studentToBeAdded.getStudentNum());
        boolean flag = false;
        for (int i=0; i<buckets.get(bucketNum).size(); ++i){
            if (buckets.get(bucketNum).get(i).getStudentNum() == studentToBeAdded.getStudentNum()){
                System.out.println("Student " + studentToBeAdded.getStudentNum() + " was removed.");
                buckets.get(bucketNum).remove(i);
                flag = true;
                break;

            }
        }
        if (!flag){
            System.out.println("No student was removed.");
        }
    }

    public void printBuckets(){
        for (int i=0; i<bucketCount; ++i){
            System.out.println("In bucket " + i + " there is:");
            for (int k=0; k<buckets.get(i).size(); ++k){
                System.out.println(buckets.get(i).get(k).getStudentNum());
            }
        }
    }
}
