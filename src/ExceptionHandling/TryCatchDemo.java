package ExceptionHandling;

public class TryCatchDemo {

	public static void main(String[] args) {
//The "try" keyword is used to specify a block where we should place exception code.
//The try block must be followed by either catch or finally. 
//It means, we can't use try block alone.
//The "catch" block is used to handle the exception.
//It must be preceded by try block which means we can't use catch block alone. 
//It can be followed by finally block later.		
		try {
		int d=10/0;
		
		}catch (ArithmeticException e) {
			e.printStackTrace();
			//System.out.println(e);
		}
		System.out.println("rest of the code");

		
		
		
		
		
		

	}

}
