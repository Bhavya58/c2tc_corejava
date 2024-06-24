package demo2;

public class FirstThread extends Thread{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("This is First Thread");
		}
	}

}
