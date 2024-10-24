package parallelProcessing;

public class Starting_2 {
	
	
	public static void main(String[] args) {
		
		SynchronizeConcept t1 = new SynchronizeConcept(1);
		t1.start();
		SynchronizeConcept t2 = new SynchronizeConcept(2);
		t2.start();
		SynchronizeConcept t3 = new SynchronizeConcept(3);
		t3.start();
		
		// another thread
		// work with synch block !!
		SynchronizeConcept t4 = new SynchronizeConcept(4);
		t4.sync_block.start();
		
		
		// every thread edit file or run file so 
		// the t1,t2,t3 (Threads) are not sync together
		// so how to fix it
		
		
		// use synchronized + static keyword at begin of function statement
		
		
		
		
	}
}