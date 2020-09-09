package AccessModifiersDemo;

public class PrivateAccessModifier {
	
//Methods, Variables and Constructors that are declared private 
//can only be accessed within the declared class itself.	
//Private access modifier is the most restrictive access level. 
//Class and interfaces cannot be private.
	
	
	private int data=50;
	private String s="javatpoint";



public static void main(String args[]) {
	
	PrivateAccessModifier pm=new PrivateAccessModifier();
	System.out.println(pm.data);
	System.out.println(pm.s);	
}
}