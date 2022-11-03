//Q.3)WAP to create a HassSet and add 5 student's id(101,102,103,104,105)  and name as value.
   //Print the name of students whose id is greater than 103.

package Collection.com;
import java.util.HashSet;
import java.util.TreeMap;

public class HashSetStudent {

	  public static void main(String[] args) {
	        System.out.println("(StudentList.......!\n");
	        HashSet <String> student = new HashSet<String>();
	        student.add("Sushil");
	        student.add("Robert");
	        student.add("Doney");
	        student.add("Juniour");
	        student.add("Peter");
	   
	        System.out.println(student.size());
	        
	        for(int i = 103; i<=105; i++) {
	        //for (String i : student) {
	        	if(student.contains(i)) {
	               
	              }
	        	  System.out.println(i);
	       }
	  }
}


