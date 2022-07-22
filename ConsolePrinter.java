package p1;

public class ConsolePrinter implements Printer {
	//can implement class directly(without using interface name) access interfaces constant? "YES"
	@Override
	public void print(String mesg) {
		System.out.println("Printing a mesg "+mesg+"on the console with speed = "+SPEED);
		
	}
}
