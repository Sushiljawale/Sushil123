
public class Dog {

	String color;
	int height;
	
	void eating()
	{
	System.out.println("eating..");	
	}
	
	void barking()
	{
	System.out.println("barking..");
		
	}
	
	
	
	public static void main(String[] args) {

		Dog d=new Dog();   //creating instance
		d.color="black";
		d.height=2;
	
		
		System.out.println("color:"+d.color);
		System.out.println("height:"+d.height);
		
		
		
		Dog d1=new Dog();    //creating instance
		d1.color="white";
		d1.height=3;

		System.out.println("\ncolor:"+d1.color);
		System.out.println("height:"+d1.height);
	}

}
