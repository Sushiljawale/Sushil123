/* Create a class Rectangle .Take two data members ---length and width.
Create two constrctors--default and parameterized(to set length and width).
write a method area() to calculate area of rectangle.
Call this method in main(). */



public class Rectangle {

		int lenght;
		int weidth;
		
		 Rectangle()    // create a default constractor
			{
				System.out.println("Constructor is  called .......");
		
			}
		 
		 Rectangle(int lenght , int weidth) //parameterised Constractor
			{
				
				this.lenght=lenght;
				this.weidth=weidth;
		    }
			
		 void area() 
		 {
			 System.out.println(" lenght:" +lenght);
				System.out.println(" weidth :" +weidth);
		 }
			
	public static void main(String[] args) {
		
		Rectangle R1=new Rectangle();
		System.out.println("length and weidth is_____________ ");
		R1.lenght=5;
		R1.weidth=6;
		R1.area();
		
		
		Rectangle  R2=new Rectangle(10,11);    //call constractor
		System.out.println("Area of Ractangle is _____________ ");
		R2.area();
		
		
	}

}
