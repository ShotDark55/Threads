package parallelProcessing;

public class Join_Concept {
	
	
	public static void main(String[] args) {
		
		Thread1 t1 = new Join_Concept().new Thread1();
		t1.start();
		
		// so to get result tell java complete thread work
		// then give me result
		
		// use join(); function 
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.notify();
		
		System.out.println("the total is " + t1.total);
		
	}
	
	
	
	public class Thread1 extends Thread {
		public int total = 0;
		
		@Override
		public void run() {
			while(total < 115) {
				System.out.println("total :" + total);
				try {
					Thread.sleep(100);
				}catch(Exception ex) {}
				total++;
			}
		}
		
		
		
	}

}
