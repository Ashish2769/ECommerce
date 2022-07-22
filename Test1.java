package p1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsolePrinter printer=new ConsolePrinter();
		printer.print("Test Mesg...");
		Printer p; //p is a interface type of the reference-->can DIRECTLY(w/o type casting)
//		refer to ANY implementation class instance, p : memory allocated in stack
		
		p=new ConsolePrinter();//indirect ref
		p.print("Another Mesg....");// javac: checks in printer interface for printI()--- finds
		// NO javac errs,JVM invokes method print on ConsolePrinter's instance:run time poly
	}

}
