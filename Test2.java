package p1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer[] printers= {new ConsolePrinter(), new FilePrinter(),new NetworkPrinter()};
		//eg of upcasting
		for(Printer p : printers)//up casting: p=printers[0]
			p.print("Some mesg!!!!!");//run time poly: achieved via interface ref-->imple class instance
		//	p.close();
			if(p instanceof FilePrinter)
			((FilePrinter)p).close();
			else
				System.out.println("Not a file printer");
	}

}
