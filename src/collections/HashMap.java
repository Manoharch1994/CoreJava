package collections;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		
				//HashMap is a class which  implements Map interface
				//extends abstract map
				//HashMap extends Map Interface
				//HashMap contains only unique elements
				//it stores the values bases on -Key,Value pair
				//It may have one null key and multiple null values
				//it maintains no order
				
		
		java.util.HashMap<Integer, String>	hm= new java.util.HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "API");
		hm.put(3, "Appium");
		hm.put(4, "BDD");
		hm.put(4, "BDD");
		
		System.out.println(hm.get(3));
		
		
		
		
		
		
		
		
	}

}
