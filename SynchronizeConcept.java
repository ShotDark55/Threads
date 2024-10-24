package parallelProcessing;

public class SynchronizeConcept extends Thread{
	
	public Sync_block sync_block = new Sync_block();
	
	
	
	public SynchronizeConcept(int x) {
		System.out.println("thread " + x);
		// x is Thread number
 
	
	}
	
	@Override
	public void run() {
		Display();
	}
	
	
	
	
	// to synchronize with each other use : 
	// static keyword : because static not change to help sync concept
	// synchronized keyword : to tell Java to do sync concept
	
	synchronized static void Display() {
		
		boolean isLive = true;
		int index = 1 ; 
		while(isLive) {
			
			System.out.println("Index : " + index );
			index++; // increment by one 
			
			try {
				Thread.sleep(100);
			}catch(Exception ex) {
				
			}
			
			if (index == 100 ) {
				isLive = false;
			}
			
			
		}
		
	}
	
	// or you can use synchronize statement witch meaning block of code
	
	
	public class Sync_block extends Thread{
		
		@Override
		public void run() {
			synchronized (this) {
				for (int x = 200 ; x >= 0 ; x-- ) {
					System.out.println("x : " + x);
					try {
						Thread.sleep(100);
					}catch(Exception ex) {}
					
				}
			}
		}
		
	}
	
	
	
	
	
	
	

}
