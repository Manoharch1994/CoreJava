
public class StringDemo {

	public static void main(String[] args) {

		
		String a="hello";
		String b="hello";
		String c=a.concat("world");
		
		System.out.println(c);
		//String bufffer and String builder--Mutable
		StringBuffer sb= new StringBuffer("Hello");
		sb.append("Selenium");
		System.out.println(sb);
		
	}

}
