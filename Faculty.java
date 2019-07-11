/*Hale Þahin
 *150116841
 *Homework6 */

import java.util.Date;
public class Faculty extends Employee{ //Faculty is subclass of Employee
	
	private String title; //argument
    
    public Faculty(){  //empty constructor
   	 super();
    }
    
    public Faculty(String name, Date birthDate){ //specified values
   	  super(name, birthDate); //call from super class
    }
    public String getTitle(){ //want title method
   	 return title;
    }
    public void setTitle(String title){ //set new value to title
   	 this.title = title;
    }
    //@override
    public String toString(){ //string representation of class
   	 return "Faculty [title = " + getTitle() + "] ";
    }

}
