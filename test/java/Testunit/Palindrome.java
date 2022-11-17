package Testunit;

import java.util.ArrayList;

public class Palindrome {
	public static boolean ispalindrome(String string) {
		
		return false;
	}	
	

	private String assertTrue(String ispalindrome) {
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
		return ispalindrome;
		
		
	}

	
	

}
