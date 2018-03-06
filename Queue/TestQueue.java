public class TestQueue{
    public static void main (String[] args){
	MyQueue thisQueue = new MyQueue(); // Instantiating a Queue
	thisQueue.printQueue(); // Shows what happens when printQueue is called and Queue is empty
	
	// Instantiating three students to add into the queue
	StudentInfo student1 = new StudentInfo(1, "Adam", "Apple"); 
	StudentInfo student2 = new StudentInfo(2, "Bob", "Banana");
	StudentInfo student3 = new StudentInfo(3, "Carl", "Coconut");
	// Adding the three students to the queue
	thisQueue.enqueue(student1);    
	thisQueue.enqueue(student2);
	thisQueue.enqueue(student3);
	thisQueue.printQueue(); // Printing items in the queue   
	System.out.println("");
	
	// Removing the three students and printing their student numbers
	System.out.println(thisQueue.dequeue().firstName + " has been removed."); 
	System.out.println(thisQueue.dequeue().firstName + " has been removed.");
	System.out.println(thisQueue.dequeue().firstName + " has been removed.");
	// Shows that program will not crash when dequeue is called and queue is empty, instead null is returned
	if (thisQueue.dequeue() == null){                      
	    System.out.println("No one in queue, dequeue method returned null.");
	}
	System.out.println("");
	
	// Adding the three previous students in a different order as well as a fourth student
	thisQueue.enqueue(student2);                           
	thisQueue.enqueue(student3);
	thisQueue.enqueue(student1);
	thisQueue.enqueue(new StudentInfo(4, "Danny", "Dragonfruit"));
	// Printing the queue after adding 4 students
	thisQueue.printQueue();                             
	System.out.println("");
	
	// Using a for loop to print all of the students' first names and dequeue all the students from the queue
	int numOfStudents = thisQueue.numInQueue;
	for (int i=0; i<numOfStudents; ++i){
	    StudentInfo dequeuedStudent = thisQueue.dequeue();
	    System.out.println(dequeuedStudent.studentNumber + "\t" + dequeuedStudent.firstName);
	}
 
    }
    
} 
