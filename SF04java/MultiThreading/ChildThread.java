package MultiThreading;

public class ChildThread extends Thread{
	
	private String msg;
	
	public ChildThread(String msg) {
		
		this.msg = msg;
	}

	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(msg+ ":" +i);
		}
	}

}
