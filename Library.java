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
		if(showLibrary){
			displayInfo();
			System.out.println(LIBRARY_NAME);
		}else {
			displayInfo();
		}
	}
	
	public static void displayTotalBooks() {
        System.out.println("Total Books: " + (bookCounter-1000) );
	}
}


public class Library {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Book", "Author");
        Book b3 = new Book();
        System.out.println("Book 1: ");
        b1.displayInfo();
        System.out.println("Book 2: ");
        b2.displayInfo(false);
        System.out.println("Book 3: ");
        b3.displayInfo(true);
        Book.displayTotalBooks();
    }
}
