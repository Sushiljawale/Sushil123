package Area.com;

public class Area {

abstract class Shape{

    abstract void RectangleArea(float length , float breadth);
    abstract void SquareArea(float radius);
    abstract void CircleArea(float side);
    
}

    void CircleArea(float radius){

	     double Area = (radius * radius)*3;

	        System.out.println("Area of Circle is: "+Area);
	        
	    }

	void SquareArea(float Side){

   double Area = Side * Side;

        System.out.println("Area of Square is: "+Area);

    }


	void RectangleArea(float length , float breadth){

   double Area = length * breadth;

        System.out.println("Area of rectangle is: "+Area);

    }




public static void main(String[] args) {

    Area a = new Area();

    a.RectangleArea(8f, 5f);

    a.SquareArea(5f);

    a.CircleArea(5);

}
}