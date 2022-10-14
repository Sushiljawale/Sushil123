//Q.3) Create a method int sum(int[] values, int start,int end) that throws an IllegalArgumentException
//when passed an array of length 0, a NullPointerException when passed a null, and
//ArrayIndexOutOfBoundsException when start and end do not fall within the range of the given array. It should return
//the sum of the values in the array from start to end but must
//throw Exception when sum is 0.

package Exception.com;

import java.util.Scanner;

public class ArryIdexQ_3 {
	public static void main(String[] args) {
	int [] mark  = new int[3];
	mark[0]= 30;
	mark[1]=50;
	mark[2]=40;
	Scanner sc = new Scanner (System.in);
	
	System.out.println("enter a index of array: ");
	int ind= sc.nextInt();
	int number=sc.nextInt();
	 try {
		 System.out.println("the value of arry index enter is : " +mark[ind]);
		 System.out.println("the sum of two indexed array is : " +(mark[ind]+mark[ind]));
		 
		 throw new IllegalArgumentException();  
	 }
	 
	 catch(IllegalArgumentException iae) {
		 System.out.println("IllegalArgumentException Occured");
		 System.out.println(iae);
		 
		
		 
	 }
	 catch(ArithmeticException  ae) {
		 System.out.println("ArithmeticException   Occured");
		 System.out.println(ae);
		 
		
		 
	 }
	 catch(ArrayIndexOutOfBoundsException aie) {
		 System.out.println("ArrayIndexOutOfBoundsException Occured");
		 System.out.println(aie);
		 
	 }
	 catch(Exception e) {
		 System.out.println("some exception Occured");
		 System.out.println(e);
		 
	 }
	
	
	System.out.println("Thanks using this program");

}
}

