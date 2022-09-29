package Members.com;

public class Manager extends Member {
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Manager() {
		super();
	}

	String department;
	
	@Override
	public void printsalary() {
		super.printsalary();
	}

	
	

}
