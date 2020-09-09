package abstraction;

public class AbstrractTest extends AbstractDemo {

	public static void main(String[] args) {
		AbstrractTest ab= new AbstrractTest();
		ab.Composeemail();
		ab.writeemail();
		

	}

	@Override
	public void Composeemail() {
		System.out.println("here i am composing email");
		
	}

}
