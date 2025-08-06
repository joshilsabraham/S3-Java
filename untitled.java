package jxh;

class Book {
	String title;
	String author;
	final int bookID;
	static int bookCounter=1000;
	static final String LIBRARY_NAME= "Central Library";
	
	Book(){
		title="Untitled";
		author="Undefined";
		bookCounter++;
		bookID=bookCounter;
	}
	
	Book(String title,String author){
		bookCounter++;
		bookID=bookCounter;	
	}
	 
    public void displayInfo() {
        System.out.println("Library: " + LIBRARY_NAME);
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
	
	public void displayInfo(boolean showLibrary){
		if(showLibrary==true) {
			System.out.println(LIBRARY_NAME);
		}	
	}
	
	public static int displayTotalBooks() {
		return bookCounter;
	}
}


public class Books {
	public static void main(String[] args) {
		Book b1= new Book();
		Book b2= new Book();
		Book b3= new Book();
	}
}	
