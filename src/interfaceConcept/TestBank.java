package interfaceConcept;

public class TestBank {

	public static void main(String[] args) {
HSBCBank b= new HSBCBank();

b.credit();
b.debit();b.transferMoney();
b.carloan();
b.eduloan();

//Dynamic Polymorphism:Child class object can be refered by parent interface reference variable



USBank ub=new  HSBCBank();
ub.credit();
ub.debit();
ub.transferMoney();



	}

}
