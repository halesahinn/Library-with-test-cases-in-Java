/*Hale Þahin
 *150116841
 *Homework6 */

public class Book { 
	
	protected Author author; //arguments
	protected int pages;
	
	public Book(){	//empty constructor
	}
	public Book(Author author, int pages){ //specified values
		this.author = author;
		this.pages = pages;
	}
	
	public Author getAuthor(){//method to print author
		return author;
	}
	public int getPages(){ //method to print pages
		return pages;
	}
	public void setAuthor(Author y){ //set new value to author
		this.author = y;

	}
	public void setPages(int num){ //set new value to pages
		this.pages = num;
	}
	public String toString(){ //string representation of class
		return "Book [Author = " + getAuthor() + ", pages " + getPages() + "]";
		}

}
