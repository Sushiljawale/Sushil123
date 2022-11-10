//Create a class Employee----name ,age,department and salary.

package com.lamabda;
import java.util.Comparator;
public class Employee {

	private String name;
	private int age;
	private String Department;
	private Double salary;
	

public class EmployeeNameSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
	
	public Employee(String name,int age, String Department, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.Department = Department;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getage() {
		return age;
	}
	public String getEmail() {
		return Department;
	}
	public Double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age +", Department=" + Department + ", salary=" + salary + "]";
	}
}