package collections;

import java.util.HashSet;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
//Set is an unordered collection of objects wherein user has no control over the insertion order.
//Duplicate values cannot be stored in Set, that means an element can only exist once in a Set.
//The Set interface contains only methods inherited from Collection and adds 
//the restriction that duplicate elements are prohibited.
		
		
		Set<String> set=new HashSet<>();
		set.add("Selenium");
		set.add("API");
		set.add("cucumber");
		set.remove(2);
		//System.out.println(set);
		for (String tech : set) {
			System.out.println(tech);
	
}		
			
	}

}
