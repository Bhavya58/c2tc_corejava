package MultiThreading;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableThread r1 = new RunnableThread(5,"First");
		RunnableThread r2 = new RunnableThread(5,"second");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.run();
		t2.run();
		
	}

}
