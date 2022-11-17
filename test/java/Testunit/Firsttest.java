package Testunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runners.Parameterized.Parameters;

import com.Junit.Labtest;

public class Firsttest {
	
	public static Labtest lab;
	
	@Before
	public void beforeAllTest() {
		lab= new Labtest();
		System.out.println("once before all test....");
	}
	@Test
	public void testAdd()
	{
	    assertEquals(30,lab.addition(10,20));
		
	}
	
	
	@Test
	public void testMultiply()
	{
	    assertEquals(200,lab.multiplication(10,20));
		
	}
	
	@Test
    @ParameterizedTest(name = "{index} => message=''{0}''")
    @CsvSource(value = {"TEST","RACECAR", "MADAM", "JAVA"})
    void shouldPassNonNullMessageAsMethodParameter(String message) {
        assertNotNull(message);
    }
	
	@Test
	public void testListInit(){
		assertTrue(myList.isEmpty()); 
		assertTrue(myList.size()== 0);
	}
	@Test
	public void testAddElements(){
		myList.add(0, "Java");
		myList.add(1, "C");
		myList.add(2, "Python");
		
		 
		myList.add(1, "Php");
		
		assertEquals("Java", myList.get(0));
		assertEquals("C", myList.get(1));
		assertEquals("Python", myList.get(2));
		assertEquals("Php", myList.get(3));	
		
		assertTrue(myList.size()==4);  //test length
	}


	@After
	public void afterAllTests()
	{
		System.out.println("Once After all tests....");	
	}
	

}
