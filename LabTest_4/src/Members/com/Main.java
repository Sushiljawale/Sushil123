package Members.com;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name="Prachi";
		emp.age=82;
		emp.number="9876543210";
		emp.address="Harsul nagar,Aurangabad-431001 ";
		emp.salary=100;
		
	System.out.println("Name of employee is "+emp.name);
	System.out.println("age of employee is "+emp.age);
	System.out.println("number of employee is "+emp.number);
	System.out.println("address of employee is "+emp.address);
	System.out.println("salary of employee is "+emp.salary);		
		
		Manager mn = new Manager();  
		mn.name="Sushil";
		mn.age=23;
		mn.number="1236549870";
		mn.address="Parvati nagar,Aurangabad-431001 ";
		mn.salary=100000;
		
		System.out.println("\nName of Manager is "+mn.name);
		System.out.println("age of age is "+mn.age);
		System.out.println("number of number is "+mn.number);
		System.out.println("address of Address is "+mn.address);
		System.out.println("salary of salary is "+mn.salary);
	}

	
}
