import java.util.ArrayList;

public class MyHashTable {
    private ArrayList<StudentInfo>[] buckets;       // Array of ArrayLists for to represent the HashTable
    private int bucketCount;                        // The number of buckets in the HashTable

    // Constructor for HashTable, parameter is the desired number of buckets
    public MyHashTable(int k){
        bucketCount = k;
        buckets = new ArrayList[k];
        for (int i=0; i<k; ++i){
            buckets[i] = new ArrayList<>();
        }
    }

    // Utility method for calculating which bucket in the HashTable the student should go into given the student number
    public int calcBucketNum(int sNum){
        return sNum % bucketCount;
    }

    // Method for finding the StudentInfo object in the HashTable given their student number
    public StudentInfo searchStudent(int studentNumberSearch){
        int bucketNum = calcBucketNum(studentNumberSearch);                             // The bucket to search in
        for (int i=0; i<buckets[bucketNum].size(); ++i){
            if (buckets[bucketNum].get(i).getStudentNum() == studentNumberSearch){      // If a matching student # is found
                return buckets[bucketNum].get(i);
            }
        }
        return null;                                                                    // If no match is found
    }

    // Method for adding students to the HashTable
    public void addStudent(StudentInfo studentToBeAdded){
        buckets[calcBucketNum(studentToBeAdded.getStudentNum())].add(studentToBeAdded);
    }

    // Method for removing students and returning the student removed
    public StudentInfo removeStudent(int studentNumberSearch){
        int bucketNum = calcBucketNum(studentNumberSearch);                                 // The bucket to search in
        int position = buckets[bucketNum].indexOf(searchStudent(studentNumberSearch));      // Position of student in bucket
        StudentInfo toBeReturned = null;                                                    // Variable to hold the return value
        if (position != -1){                                                                // If the student is in the HashTable
            toBeReturned = buckets[bucketNum].get(position);
            buckets[bucketNum].remove(position);
        }
        return toBeReturned;
    }

    // Method for printing all the student numbers in the HashTable
    public void printBuckets(){

        // Printing all student numbers in one bucket before moving onto the next bucket
        for (int i=0; i<bucketCount; ++i){
            System.out.print("In bucket " + i + " there is: ");

            // Printing student numbers in a bucket in the order that they were added
            for (int k=0; k<buckets[i].size(); ++k){
                System.out.print(buckets[i].get(k).getStudentNum() + " ");
            }
            System.out.println();
        }
    }
}
