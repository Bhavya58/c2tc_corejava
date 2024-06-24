package demo2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstThread t1 = new FirstThread();
		SecondThread t2 = new SecondThread();
		
		t1.start();
		t2.start();

	}

}
