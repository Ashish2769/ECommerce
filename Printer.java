package p1;

public interface Printer {
	//javac implicitly adds: public static final
	int SPEED = 100;//constant are written in CAPITAL letters
	void print(String mesg);
	
}
