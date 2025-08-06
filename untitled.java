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
		bookID++;
		bookCounter++;
	}
	
	Book(String title,String author){
		bookCounter++;
	}
	
	public String displayInfo(){
		 title;
	
	}
	
	public displayInfo(boolean showLibrary){
		if(showLibrary==true) {
			show LIBRARY_NAME;
		}	
	}
	public static displayTotalBooks() {
		System.out.println();
	}
}


public class Books {
	Book b1= new Book();
	Book b2= new Book();
	Book b3= new Book();

}
