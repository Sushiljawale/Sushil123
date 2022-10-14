
public class Person {

	String name;
	int age;
	String contact;
	Addresss address;
	
	public Person() 
	{
		super();
		
	}
	
	public Person(String name,int age, String contact, Addresss address)
	{
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address = address;
		
	}
	void displayInfo()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Contact :"+contact);
		System.out.println("Address :");
		address.displayAddress();
		
	}
	
}
