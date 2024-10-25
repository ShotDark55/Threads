package parallelProcessing;

public class Wait_Notify extends Thread{ 
	
	int total = 0;
	
	@Override
	public void run() {
		while(total < 90 ) {
			System.out.println("total : " + total);
			try {
				Thread.sleep(100);
			}catch(Exception ex) {
				
			}
			total++;
			
			
		}
		
		
		
	}
	
}
	
	
	