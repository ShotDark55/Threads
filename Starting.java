package parallelProcessing;

public class Starting {

	public static void main(String[] args) {
		
		// this is two thread with two function run at same time with out stop
		
		LoopDisplay t1 = new LoopDisplay("@");
		TimeLocal t2 = new TimeLocal();
		
		// you can use more then one instance if you want 
		LoopDisplay t3 = new LoopDisplay("oussama");
		
				
		
		t1.start(); // don't use run function because you out of parallel processing , just use start();
		t2.start(); // same thing !
		t3.start();
		
		
	
	}
		

	
	
	}
		