/*Hale Þahin
 *150116841
 *Homework6 */

import java.util.Date;
public class Person {
		
	protected String name; //create arg
	protected Date birthDate; //create arg

		      public Person(){ //empty constructor
			  }
		      public Person(String name, Date birthDate){ //constructor with specified values
			  this.birthDate = birthDate;
			  this.name = name;
		      }
		      public String getName(){//getName method
			  return name;
		      }
		      public Date getBirthDate(){//getBirthDate method
			  return birthDate;
		      }
		      public String toString(){//string representation
		      return "Person [name = " + getName() + ",birthDate = " + getBirthDate() + "]";
		      }
}
