package Members.com;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name="Sushil";
		emp.age=23;
		emp.number="9876543210";
		emp.address="Harsul nagar,Aurangabad-431001 ";
		emp.salary=100000;
		
	System.out.println("Name of employee is : "+emp.name);
	System.out.println("Age of employee is : "+emp.age);
	System.out.println("Number of employee is : "+emp.number);
	System.out.println("Address of employee is : "+emp.address);
	System.out.println("Salary of employee is : "+emp.salary);		
		
		Manager mn = new Manager();  
		mn.name="Sushant";
		mn.age=26;
		mn.number="1236549870";
		mn.address="Parvati nagar,Aurangabad-431001 ";
		mn.salary=200000;
		
		System.out.println("\nName of Manager is : "+mn.name);
		System.out.println("Age of manager is : "+mn.age);
		System.out.println("Number of manager is : "+mn.number);
		System.out.println("Address of manager is : "+mn.address);
		System.out.println("Salary of manager is : "+mn.salary);
	}

	
}
