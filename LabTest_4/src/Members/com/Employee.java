package Members.com;

public class Employee extends Member{
	String specialization;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	@Override
	public void printsalary() 
	{
		
		super.printsalary();
	}	

}
