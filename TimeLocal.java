package parallelProcessing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeLocal extends Thread{
	
	@Override
	public void run() {
		liveTime();
	}
	
	
	
	
	public void liveTime() {
		
		
		
		while(true) {
			
			System.out.println(new SimpleDateFormat("HH:mm:ss a").format(new Date()));
			
			try {
				
				Thread.sleep(1000);
				
			}catch(Exception ex) {}
			
			
			
		}
	}
		
		


}
