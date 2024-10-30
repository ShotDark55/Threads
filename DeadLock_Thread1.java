package parallelProcessing;

public class DeadLock_Thread1 extends Thread { 
	
	@Override
	public void run() {
		
		synchronized (DeadLock_computer_interface.computer_1) {
			// T1 -> computer 1 -> connect
			System.out.println("T1 : set computer 1 to connected ");
			
			// computer 1 -> set computer 2 to connected 
			// so computer waiting computer 2 to connect 
			
			System.out.println("T1 : computer 1 waiting computer 2 to connect" );
			try {
				// use for time waiting 
				Thread.sleep(1000);
			}catch(Exception ex) {
				
			}
			
			synchronized (DeadLock_computer_interface.computer_2) {
				System.out.println("T1 : computer 1 set computer 2 to connected");
			}
		}
		
	}

}
