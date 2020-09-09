package methodOverLoading;

public class MethodOverLoading {
//Polymorphism allows us to perform a task in multiple ways.
	
//A class having multiple methods with same name but different parameters is called Method Overloading
	public void sum(int i) {
		System.out.println("1 input-paramerer");
		
	}
	public void sum(int i,int j) {
		System.out.println("2 input-paramerer");
		System.out.println(i+j);
		
	}
	
	public static void main(String[] args) {
	MethodOverLoading m=new MethodOverLoading();
	m.sum(10);
	m.sum(10, 20);

	}

}
