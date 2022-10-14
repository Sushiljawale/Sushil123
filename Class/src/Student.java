
public class Student {

	String name;
	int id;
	
	void age()    // method create
	{
		System.out.println("age is ...");
	}
 
	void number()
	{
	System.out.println("9021952634");	
	}

	
	public static void main(String[] args) {
	
		Student st=new Student();   // instance create and call the method
		st.name="Sushil";
		st.id=10;
		
		st.age();
		st.number();
		
		System.out.println("name is :"+st.name);
		System.out.println("id :"+st.id);
		
		
	}

}
