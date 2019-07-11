/*Hale Þahin
 *150116841
 *Homework6 */

import java.util.Date;
public class Author extends Person{ //subclass of Person
	
	private Person manager; //argument
	 
	public Author(String name, Date birthDate){ //constructor with specified values
		super(name,birthDate); //call from the super class
	}
	public Person getManager(){ //get manager with person data type
		return  manager;
	}
    public void setManager(Person x){ //set manager with new value
    	this.manager = x;
    }
    //@override
    public String toString(){ //string represenatation of class
    	return "Author [manager = " + manager.toString() + "] ";
}
}
