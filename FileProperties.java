//Q2.Write a Java program to get a list of all file/directory names from the given string.
package iostream.com;
import java.io.File;

public class FileProperties {
	

	    public static void main(String args[])
	    {
	        File file = new File("D:/Users/Sushil");
	        String[] fileList = file.list();
	        for(String name:fileList)
	        {
	            System.out.println(name);
	        }
	    }

}


