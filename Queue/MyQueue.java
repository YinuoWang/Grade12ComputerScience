public class MyQueue{
    public StudentInfo frontOfQueue;
    public int numInQueue; // The number of students in the queue
    
    // Constructor
    public MyQueue(){
	frontOfQueue = null;
	numInQueue = 0;
    }
    
    // Enqueue method
    public void enqueue (StudentInfo studentToBeAdded){
	StudentInfo tempStudent = frontOfQueue; // Temporary variable used to traverse the queue until the rear is reached
	// Traverse the queue until tempStudent is the reference to the last item in the queue
	for (int i=0; i<numInQueue-1; ++i){
	    tempStudent = tempStudent.nextStudent;
	}
	// If queue is empty, set frontOfQueue to the student you want to add to the queue
	if (frontOfQueue == null){
	    frontOfQueue = studentToBeAdded;
	}
	// Else, add the student you want to add to the end of the queue
	else{
	    tempStudent.nextStudent = studentToBeAdded;
	}
	++numInQueue;
    }
    
    // Dequeue method
    public StudentInfo dequeue(){
	StudentInfo toBeReturned = frontOfQueue; // Temporary variable that will hold the reference to the StudentInfo that will be returned
	// If there are no items in the list, return null;
	if (toBeReturned == null){
	    return null;
	}
	// Else, set frontOfQueue to be the second student in the queue, thus removing the student at the front of the queue
	else{
	    frontOfQueue = toBeReturned.nextStudent; 
	}
	--numInQueue;
	return toBeReturned;
    }
    
    // Peek method, returns item at the front of the queue
    public StudentInfo peekQueue(){
	return frontOfQueue;
    }
    
    // Method to print items in the queue
    public void printQueue(){
	// If there are no items in the list, print the error message
	if (numInQueue == 0){
	    System.out.println("Error! No items in queue. \n");
	}
	else{
	    StudentInfo currentStudent = frontOfQueue; // Temporary variable to traverse the queue
	    for (int i=0; i<numInQueue; ++i){
		System.out.print(currentStudent.studentNumber + "\t");
		System.out.print(currentStudent.firstName + "\t");
		System.out.print(currentStudent.lastName + "\n");
		currentStudent = currentStudent.nextStudent;
	    }
	} 
    }
    
}
