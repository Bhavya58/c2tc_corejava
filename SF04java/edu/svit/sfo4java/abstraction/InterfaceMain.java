package edu.svit.sfo4java.abstraction;

public class InterfaceMain {
	public static void main(String[] args) {
		Sim sOne=new Jio();
		sOne.makeCall();
		sOne.sendMsg();
		
		Sim sTwo=new Airtel();
		sTwo.makeCall();
		sTwo.sendMsg();
	}

}
