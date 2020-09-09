package encapsulation;

public class EmployeeData {
//Encapsulation:is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

//declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable

	private int ssn;
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}



	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	private String empname;
	private int age;
	
	

	public static void main(String[] args) {
		EmployeeData emp=new EmployeeData();
		emp.setAge(20);
		emp.setEmpname("ManoharQA");
		emp.setSsn(456454);
		
		
		System.out.println("Employee age is:"+emp.getAge());
		System.out.println("Employee Name is:"+emp.getEmpname());
		System.out.println("Eployee SSN is:"+emp.getSsn());
		
		

	}

}
