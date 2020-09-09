package collections;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		//List is an ordered collection and can contain duplicate elements. 
		//You can access any element from it’s index. 
		//List is more like array with dynamic length. 
		List<String> list=new ArrayList<String>();
		list.add("Selenium");
		list.add("API");
		list.add("BDD");
		list.add("UFT");
		//System.out.println(list);
		// //Iterating the List element using for-each loop  
		
		
		System.out.println(list.get(2));
	
		  for (String courses : list) { System.out.println(courses);
		  
		 }
	
		
		
		
		
		
		
	}

}
