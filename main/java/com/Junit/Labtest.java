/* Q.1)Write a program for addition() and multiplication() of two numbers.
   Q.2)Write a program for to check a pallindrome string.
   Q.3)Create an ArrayList.Add few elements.
*/

package com.Junit;

import java.util.ArrayList;

public class Labtest {

	public int addition(int n1,int  n2)
	{
		return n1+n2;

	}
	
	public int multiplication(int n1,int  n2)
	{
		return n1*n2;

	}
	
/*Q.2)Write a program for to check a pallindrome string.
    Write test cases for 4 different parameters (use @parametrizedTest annotaion). */	
	
	public String ispalindrome(String str) {
		ArrayList<String> str1 = new ArrayList<String>();
		str1.add("TEST");
		str1.add("RACECAR");
		str1.add("MADAM");
		str1.add("JAVA");

                int n = str1.size();
                String[] arr = new String[n];
                //ArrayList to Array
                str1.toArray(arr);
		for(int i=0;i<n;i++)
			arr[i] = str1.get(i);
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);
			if(i!=n-1)
			 System.out.print(", ");			
		}
		return str;
		
		
	}
	
	
/*Q.3)Create an ArrayList.Add few elements.
    Write following test cases in a separate java file--
    a)Test for empty list.
    b)Test  for size of arrayList.*/
	
public String Arrylist() {
	ArrayList<String> myList = new ArrayList<String>();
	myList.add("Java");
	myList.add("C");
	myList.add("Python"); // Adding object in arraylist
	System.out.println("ArrayList: " + myList);
	System.out.println("size of arraylist is : " + myList.size()); // test the size of aaray.
	// test array list is empty
	if (myList.isEmpty()) {
		System.out.println("The ArrayList is empty");
	} else {
		System.out.println("The ArrayList is not empty");
	}
	return null;
}
	
	


}
