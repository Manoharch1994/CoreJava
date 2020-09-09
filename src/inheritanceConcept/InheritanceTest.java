package inheritanceConcept;

public class InheritanceTest extends InheritanceDemo {

	
	public void childmethod() {
		System.out.println("this is child method");
	}
	public static void main(String[] args) {

		
		InheritanceTest it= new InheritanceTest();
		it.parentmethod();
		System.out.println(it.i);
		it.childmethod();
		
		
		
	}

}
