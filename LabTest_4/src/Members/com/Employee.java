package Members.com;

public class Employee extends Member{
	String specialization;
	
	
	public Employee() {
		super();

	}
	
	//getter method
	public String getSpecialization() {
		return specialization;
	}


	//setter method
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	@Override
	public void printsalary() 
	{
		
		super.printsalary();
	}	

}
