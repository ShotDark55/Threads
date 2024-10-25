package parallelProcessing;


public class Wait_Notify_Runing {
	
	public static void main(String[] args) {
		
		Wait_Notify t1 = new Wait_Notify();
		
		// same example 
		// but difference is i can select part of code 
		// i want to start to part i want to end
		// so wait mean don't run any thing else only thread
		// notify mean or tell java us run any thing
		
		// so to do that use synchronized block
		// add your thread at parameter of statement
		
		synchronized(t1) {
			// why use synchronized because required
			// in wait and notify 
			// mean need sync 
			
			t1.start();
			
			try {
				t1.wait();
				
				// use notify at block of function 
				// remember you can specify your code
				// or add notify at time of you want to thread 
				// complete work mean stop
				
				
				// so go to Thread1 and run function and 
				// add notify(); function !
				
			}catch(Exception ex) {
				
			}
			
			System.out.println("my total : " + t1.total);


		}
	}
	

	

}
