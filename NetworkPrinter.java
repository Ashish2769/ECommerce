package p1;

public class NetworkPrinter implements Printer {

	@Override
	public void print(String mesg) {
		// TODO Auto-generated method stub
		System.out.println("sending a mesg to network printer: "+mesg+" with speed = "+SPEED);

	}

}
