package jxh;

class Book {
	String title;
	String author;
	double price;
	int quantity;
	Book(String title, String author, double price, int quantity){
    	this.title=title;
    	this.author=author;
    	this.price=price;
        this.quantity=quantity;
    }    
	public void displayDetails() {
		System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    	System.out.println("Quantity: " + quantity);
    	System.out.println("Total Value: " + (price*quantity));
	}
	
}

public class BookStore {
    public static void main(String[] args) {
    	Book b1= new Book("Title 1","Author 1",150,500);
    	b1.displayDetails();
    	Book b2= new Book("Title 2","Author 2",200,400);
    	b2.displayDetails();
    }
}
