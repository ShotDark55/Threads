package parallelProcessing;

public class LoopDisplay extends Thread{
	private String input;
	
	
	public LoopDisplay(String input ) {
		this.input = input;
		
	}
	
	@Override
	public void run() {
		Display(input);
	}
	
	
	public void Display(String input) {
		int x = 0;
		while(true) {
			
			try {
				Thread.sleep(1000);
			}catch(Exception ex ) {}
			System.out.println(x +  " " +input);
			x++;
		}
			
			
		} 
	}


