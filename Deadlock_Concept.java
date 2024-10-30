package parallelProcessing;

public class Deadlock_Concept {
	
	
	// in this example i will show you 
	// to computer want to connect to the server 
	// but computer 1 waiting computer 2 to connect 
	// but at opposite : 
	// computer 2 waiting computer 1 to connect
	
	
	public static void main(String[] args) {
		DeadLock_Thread1 t1 = new DeadLock_Thread1();
		DeadLock_Thread2 t2 = new DeadLock_Thread2();
		
		t1.start();
		t2.start();
	}
	

}
