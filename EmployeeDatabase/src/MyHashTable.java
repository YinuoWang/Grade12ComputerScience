import java.util.ArrayList;

public class MyHashTable {
    private ArrayList<EmployeeInfo>[] buckets;       // Array of ArrayLists for to represent the HashTable
    private int bucketCount;                        // The number of buckets in the HashTable

    // Constructor for HashTable, parameter is the desired number of buckets
    public MyHashTable(int k){
        bucketCount = k;
        buckets = new ArrayList[k];
        for (int i=0; i<k; ++i){
            buckets[i] = new ArrayList<>();
        }
    }

    // Utility method for calculating which bucket in the HashTable the employee should go into given the employee number
    public int calcBucketNum(int sNum){
        return sNum % bucketCount;
    }

    // Method for finding the EmployeeInfo object in the HashTable given their employee number
    public EmployeeInfo searchEmployee(int employeeNumberSearch){
        int bucketNum = calcBucketNum(employeeNumberSearch);                             // The bucket to search in
        for (int i=0; i<buckets[bucketNum].size(); ++i){
            if (buckets[bucketNum].get(i).getEmployeeNum() == employeeNumberSearch){      // If a matching employee # is found
                return buckets[bucketNum].get(i);
            }
        }
        return null;                                                                    // If no match is found
    }

    // Method for adding employees to the HashTable
    public void addEmployee(EmployeeInfo employeeToBeAdded){
        buckets[calcBucketNum(employeeToBeAdded.getEmployeeNum())].add(employeeToBeAdded);
    }

    // Method for removing employees and returning the employee removed
    public EmployeeInfo removeEmployee(int employeeNumberSearch){
        int bucketNum = calcBucketNum(employeeNumberSearch);                                 // The bucket to search in
        int position = buckets[bucketNum].indexOf(searchEmployee(employeeNumberSearch));     // Position of employee in bucket
        EmployeeInfo toBeReturned = null;                                                    // Variable to hold the return value
        if (position != -1){                                                                 // If the employee is in the HashTable
            toBeReturned = buckets[bucketNum].get(position);
            buckets[bucketNum].remove(position);
        }
        return toBeReturned;
    }

    // Method for printing all the employee numbers in the HashTable
    public void printBuckets(){

        // Printing all employee numbers in one bucket before moving onto the next bucket
        for (int i=0; i<bucketCount; ++i){
            System.out.print("In bucket " + i + " there is: ");

            // Printing employee numbers in a bucket in the order that they were added
            for (int k=0; k<buckets[i].size(); ++k){
                System.out.print(buckets[i].get(k).getEmployeeNum() + " ");
            }
            System.out.println();
        }
    }
}
