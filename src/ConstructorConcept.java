
public class ConstructorConcept {
	
	//constructor is used to initialize  the  objects.
	//new keyword always call constructor of the class
	//every class has constructor
	//if we don't not explicitly write constructor for class,java compiler builds a default constructor for that class
	//we can overload the constructors by passing different parameters.
	String name;
	
	
	public ConstructorConcept() {
		System.out.println("Default constructor");
	}
	public ConstructorConcept(int i) {
		System.out.println("1 Parameter constructor");
	}
	
	public ConstructorConcept(String name) {
			this.name=name;	
	}

	public static void main(String[] args) {
		ConstructorConcept cc= new ConstructorConcept();
		ConstructorConcept cc1= new ConstructorConcept(10);
		ConstructorConcept cc2= new ConstructorConcept("Manohar");
	

	}

}
