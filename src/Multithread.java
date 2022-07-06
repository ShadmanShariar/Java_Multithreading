
//Author - Shadman Shariar

//Java Multithreading

public class Multithread{

	
	public static void main(String[] args) {
		
		//Multithreading Class Object
//		Multithreading obj = new Multithreading();
//		Multithreading obj2 = new Multithreading();
	    //Java as usual sigle thread
		
		//obj.run();
		
		//Java Multithreading
		
		//We should use start key word here
		
		// 2 Thread side by side
		
//		obj.start();
//		obj2.start();
		
		//For More Than 2 Threads
		
		//5 Threads
		
		for (int i = 1; i <= 5; i++) {
			
			Multithreading obj3 = new Multithreading(i);
			obj3.start();

			// For same time execution
            //We should use implements Runnable here for this    
//			Thread tf = new Thread(obj3);
//			tf.start();
//			System.out.println("---------------");
			//Shows Thread is alive or not, return boolean value
//			System.out.println(obj3.isAlive());
			//This thing wait for another Thread to die
//			try {
//				obj3.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		}
//		throw new RuntimeException();
	}
	
	
}
