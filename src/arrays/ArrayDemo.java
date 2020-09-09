package arrays;

public class ArrayDemo {

	
	/*
	 * Array is a collection of similar type of elements that have contiguous memory
	 * location. We can store only fixed set of elements in an array. Array is index
	 * based, first element of the array is stored at 0 index. There are two types
	 * of array in java software development language. One Dimensional Array and Two
	 * Dimensional Array.
	 */	public static void main(String[] args) {
		 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		 
		 //Access the Elements of an Array
		 System.out.println("Before Changing the Array Element:"+cars[1]);
		// Change an Array Element
		 cars[1]="Skoda";
		 System.out.println("After Changing the Array Element:"+cars[1]);
		 //Array Length
		 System.out.println(cars.length);
		 //Loop Through an Array to print all values in Array
		 for (String i : cars) {
			System.out.println(i);
			
		}


		
		

	}

}
