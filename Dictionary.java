/*Hale Þahin
 *150116841
 *Homework6 */

public class Dictionary extends Book { //Subclass of Book

	private int defs; //argument
	
	public Dictionary(){  //empty constructor
	}
	public Dictionary(Author author, int pages, int defs){ //constructor with new values
		super(author,pages); //call from the super class
		this.defs = defs;
	}
	public int getDefs(){ //method to print defs
		return defs;
	}
	public void setDefs(int defs){ //set new value to defs
		this.defs = defs;
	}
	//@override
	public String toString(){ //string representation of class
		return "Dictionary [defs = " + getDefs() + "]";
	}
	
}
