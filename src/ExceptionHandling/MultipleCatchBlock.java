package ExceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
//A try block can be followed by one or more catch blocks.		
//Each catch block must contain a different exception handler. 
//So,If you have to perform different tasks at the occurrence of different exceptions.	
try {
		

	  int a[]=new int[5]; 
	  a[0]=10;
	  a[1]=20;
	  a[2]=40;
	  a[3]=50;
	  a[4]=60;
	 a[5]=70;
	  
	int d=10/0;
	 
	
	   
}catch (ArithmeticException e) {
e.printStackTrace();
	
}
catch (ArrayIndexOutOfBoundsException e) {
System.out.println(e.getMessage());	
}
	
catch (Exception e) {
System.out.println("Parent Exception occurs");
}
}
		
	


}

