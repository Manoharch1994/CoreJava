
public class Dog extends Animal
{

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("the dog says: bow bow");
	}

	public static void main(String args[]) {
		Dog obj=new Dog();
		obj.animalSound();
		obj.sleep();
	}
	
	
}
