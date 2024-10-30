package parallelProcessing;

public class DeadLock_Thread2 extends Thread{
	
	@Override 
	public void run() {
		synchronized(DeadLock_computer_interface.computer_2) {
			// T2 want computer 2 to connected 
			System.out.println("T2 : set computer 2 to connected");
			
			// but computer 2 want computer 1 to connect 
			
			// so he waiting 
			
			System.out.println("T2 : computer 2 waiting computer 1 to connected");
			
			try {
				
				// waiting just 1000 m s
				Thread.sleep(1000);
				
			}catch(Exception ex) {
				
			}
			
			synchronized (DeadLock_computer_interface.computer_1) {
				System.out.println("T2 : computer 2 set computer 1 to connected");
			}
		}
	}

}
