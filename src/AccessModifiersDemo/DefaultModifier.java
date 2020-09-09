package AccessModifiersDemo;

public class DefaultModifier {
	
	
	
	// The access level of a default modifier is only within the package
	//It cannot be accessed from outside the package. 
	//If you do not specify any access level, it will be the default.
	
	String s="Javatpoint";
	  void msg(){
		  
		  System.out.println("Hello");
		  
	  }  

	




public static void main(String args[]) {
	
	DefaultModifier df= new DefaultModifier();
	df.msg();
	System.out.println(df.s);
}
	
	
}