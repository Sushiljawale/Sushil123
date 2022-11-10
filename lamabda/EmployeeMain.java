package com.lamabda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Rowert", 25,"physics", 50000.00));
		empList.add(new Employee("Downey", 26, "Chemistry", 10000.00));
		empList.add(new Employee("Junior", 26, "Mathematics", 80000.00));
		empList.add(new Employee("Peter", 31,"Biology", 5000.00));
		empList.add(new Employee("Parker", 27, "Computer", 90000.00));
		empList.add(new Employee("Steve", 23, "Zoology", 30000.00));
		
		System.out.println("List of employee before sorting..");
		empList.forEach(System.out::println);
	
		
		
		Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		
		System.out.println("--------------------------------------------");
		System.out.println("\n List of employee after sorting..");
		empList.forEach(System.out::println);

		
		
/*2. filter and print employees whose salary is greater than 10000 and 
 also print the total number of employees having salary  greater than 10000.(Use Stream APIs) */
            System.out.println(" \n Maximum salary of employees are ................");
            empList.stream()
            .filter(e -> e.getSalary()>10000)
            .forEach(System.out::println);
            
            
//Q.3)Print employee name and department whose salary is maximum. 
            System.out.println("\n...............");
            Optional<Employee> maxSalaryEmp = 
            		empList.stream()
                    .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
            System.out.println("Employee with max salary:"
                    + (maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not Applicable"));
	}
}