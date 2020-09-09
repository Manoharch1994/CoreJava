package ExceptionHandling;

public class FinallyDemo1 {

	public static void main(String[] args) {
	try {
		System.out.println("Try");
	}
		catch(Exception e) {
			System.out.println("Catch");
		}
	
finally {
	System.out.println("finally");
}	

	}

}
