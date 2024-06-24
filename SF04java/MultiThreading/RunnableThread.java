package MultiThreading;

public class RunnableThread implements Runnable{

	int n;
	String msg;
	
	
	
	public RunnableThread(int n, String msg) {
		super();
		this.n = n;
		this.msg = msg;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=n;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(msg+i);
			
		}
	}

}
