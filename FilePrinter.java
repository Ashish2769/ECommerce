package p1;

public class FilePrinter implements Printer {
	@Override
	public void print(String mesg) {
		System.out.println("Saving a mesg: "+mesg+" in file, with speed = "+SPEED);
		
	}
	
	public void close()
	{
		System.out.println("Closing file...");
	}
}
