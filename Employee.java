/*Hale Þahin
 *150116841
 *Homework6 */

import java.util.Date;
public class Employee extends Person{ //Employee is subclass of Person
	
	protected double salary; //argument
	
	public Employee(){
		super();//take constructor of super class
	}
	public Employee(String name, Date birthDate){
		super(name,birthDate);//take arguments of super class
	}
	public double getSalary(){
		return salary; //get Salary method
	}
	public void setSalary(double salary){
		this.salary = salary; //set salary with new specified value
	}
	//@override
	public String toString(){ //string representation of class
		return "Employee " + " [salary=" + getSalary() + "]";
	}

}
