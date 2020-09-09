package ExceptionHandling;

public class Throw {
//The Java throw keyword is used to explicitly throw an exception.
//We can throw either checked or unchecked exception in java by throw keyword
// The throw keyword is mainly used to throw custom exception.		
	public static void checkAge(int age) {
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	    }
	    else {
	      System.out.println("Access granted - You are old enough!");
	    }
	  }

		public static void main(String[] args) {
			
		    checkAge(12); 

		}
		
		
		
	}


