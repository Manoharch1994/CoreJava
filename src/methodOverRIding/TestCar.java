package methodOverRIding;

public class TestCar {
//Declaring a method in child class which is already present in the parent class is called Method Overriding.
	
	public static void main(String[] args) {
		
		//static polymorphism//compile time polymorphism
		
		Bmw b= new Bmw();//Overridden method
		b.start();
		b.stop();
		b.AutoStart();
		b.fuel();
		
		System.out.println("*****************************");
		Car c= new Car();
		c.start();
		c.stop();
		c.fuel();
		System.out.println("*****************************");
//Child class object can be refereed by parent  class reference variable is called 
//RUNTIME POLYMORPHYSM or DYNAMIC POLYMORPHYSM
		
	Car c1= new Bmw();
	c1.start();
	c1.stop();
	c1.fuel();
	
		
	
		
		
		
	}

}
