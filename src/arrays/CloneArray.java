package arrays;

public class CloneArray {

	public static void main(String[] args) {
		 int arr[]= {10,11,12,13};
	
			for (int i : arr) {
				System.out.println(i);
			}
			 System.out.println("before cloning array");
				int clone[]=arr.clone();
				for (int j : clone) {
					System.out.println(j);
					
				}
				System.out.println(arr==clone);

		}
		

	}


