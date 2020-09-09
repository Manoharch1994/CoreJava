
public class RemoveJunkChar {

	public static void main(String[] args) {

		String s="@@@%%%*&&*web automation123456";
		s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
	
	}

}
