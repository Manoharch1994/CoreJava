package interfaceConcept;

public class HSBCBank implements USBank {
//if a class is implementing interface,	then its mandatory to define/override all the methods of interface
	@Override
	public void credit() {
System.out.println("hsbc--credit");		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("hsbc--debit");	
	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		System.out.println("hsbc--transferMoney");	
		
	}
	
	public void carloan() {
		System.out.println("hsbc--carloan");
	}
	public void eduloan() {
		System.out.println("hsbc--eduloan");
	}
	

}
