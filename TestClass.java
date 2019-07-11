/*Hale Þahin
 *150116841
 *Homework6 */

import java.util.Date;
public class TestClass {
	@SuppressWarnings("deprecation") 
	public static void main (String[] args){
		
		Person hale = new Person("Hale Sahin", new Date( 1996,8,26));  //create a person
		Employee ahmet = new Employee("Ahmet Þanlý", new Date(1993,2,15)); //create an employee object
		ahmet.setSalary(3500);  //set new value to salary of ahmet 
		Author erkan = new Author("Erkan Tok", new Date()); //create an author
		Author eysan = new Author("Eysan Mutlu", new Date(1967,2,5)); //create another author
		erkan.setManager(ahmet); //set ahmet to manager of erkan
		eysan.setManager(hale); //set hale to manager of eysan
		Book history = new Book(erkan, 1461); //create a new book
		Student talha = new Student("Talha Kursun", hale.getBirthDate(), 3.61); //create a student
		talha.setBorrowedBook(history); //set talhas borrowed book as history
		Dictionary redWord = new Dictionary(eysan, history.getPages(), 61);  //create a dictionary object
		Faculty fuat = new Faculty("Fuat Temel",ahmet.getBirthDate()); //create a faculty as Fuat
		
		//control the prints
		System.out.println(hale + "\n********");
		System.out.println(ahmet + " " + ahmet.getName() + "\n********");
		System.out.println(eysan + " " + eysan.getName() + " "  + "\n********");
		System.out.println(erkan.getManager() + " " + ahmet.getName() + " " + ahmet.getBirthDate() + "\n********");
		System.out.println(history + " " + erkan.getName() + "\n********");
		System.out.println(talha.getBorrowedBook() + " " + talha.getName() + "\n********");
		System.out.println(talha +  "\n********");
		System.out.println(redWord + " " + redWord.getAuthor() + " " + redWord.getPages() + "\n********");
		System.out.println(fuat.getClass().getSuperclass() + "\n********");
		System.out.println(fuat + " " + fuat.getName() + " " + fuat.getSalary() + "\n********");
		
		//update a few fields
		fuat.setTitle("Doc.Dr."); //set title to object fuat
		fuat.setSalary(10500); //set new salary to fuat
		System.out.println(fuat + " " + fuat.getName() + " " + fuat.getSalary() + "\n********"); //display changes
		
		/* check subclass hierarchy */  
		  if (ahmet instanceof Person && redWord instanceof Book) {    
			  System.out.println("good deal :)");  
			  }   
		  System.out.println("********"); 
		 
		  if (fuat instanceof Person && fuat instanceof Employee && fuat instanceof Faculty) {    
			  System.out.println("Fuat is teaching something.");   
			  } 
		
	}
}
