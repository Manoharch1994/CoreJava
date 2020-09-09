package AccessModifiersTest;

import AccessModifiersDemo.DefaultModifier;

public class DefaultTest {

	public static void main(String[] args) {

		//compile time error
		DefaultModifier df=new DefaultModifier();
		/*
		 * df.msg(); System.out.println(df.s);
		 */
	}

}
