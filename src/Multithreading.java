
//using implements Runnable Instead of extends Thread same thing

public class Multithreading extends Thread{

	//Constructor for printing the thred number

	private int threadnumber;
	
	public Multithreading(int threadnumber) {
		
		
		this.threadnumber = threadnumber;
		
	}
	
	
	@Override
	public void run() {
		
//		try {
		for (int i = 1; i <= 10 ; i++) {
			
			System.err.println(i+" From Thread "+threadnumber);
			
//			if(threadnumber==5) throw new RuntimeException();
			
			//For waiting time
			try {
				Thread.sleep(1000); // 1000 ms = 1 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Half Thread e asi now");
				e.printStackTrace();
				
			}
			
		}
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("Half Thread e asi now");
//			
//			
//		}
		
	}
	
	
}
