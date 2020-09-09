package ExceptionHandling;

public class ThrowsKeyWord {

	public static void main(String[] args)throws ArithmeticException {
		ThrowsKeyWord obj= new ThrowsKeyWord();
		obj.sum();

	}
public void sum()throws ArithmeticException {
	div();
}

public void div()throws ArithmeticException {
	int i=10/0;
	
}
}
