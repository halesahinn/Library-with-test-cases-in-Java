/*Hale Þahin
 *150116841
 *Homework6 */

import java.util.Date;
public class Student extends Person {//Student is subclass of Person
	
	private double gpa; //argument
	private Book borrowedBook; //argument
	
	public Student(String name, Date birthDate, double gpa){ //Constructor
		super(name,birthDate); //call the values from super class
		this.gpa = gpa;
	}
	public Book getBorrowedBook(){
		return borrowedBook;//get borrowed book method
	}
	public double getGPA(){ //want gpa value method
		return gpa;
	}
	public void setBorrowedBook(Book k){ //set new value for borrowed book
		this.borrowedBook = k;
	}
	//@override
	public String toString(){ //string representation of class
		return "Student [gpa = " + getGPA() + ", borrowedBook = " + getBorrowedBook() + "] ";
		}

}
