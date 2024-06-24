package MultiThreading;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		ChildThread ch1 = new ChildThread("First");
		ChildThread ch2 = new ChildThread("Second");
		
		ch1.start();
		ch2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main function end");
		
	}

}
