class Student {
    String name;
    int rollNumber;
    int maths;
    int english;
    int science;
    float average;
    Student(String name, int rollNumber, int maths, int english, int science){
    	this.name=name;
    	this.rollNumber=rollNumber;
    	this.maths=maths;
        this.english=english;
        this.science=science;
    }    
    public void calculateAverage() {
    	average = (maths+english+science)/3;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks for Maths: " + maths+"\nMarks for English: " + english +"\nMarks for Science: " +science);
    	System.out.println("Average Marks: " + average);
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        Student s1= new Student("John",20,50,45,48);
        s1.calculateAverage();
        s1.displayDetails();
        Student s2= new Student("Joshil",22,40,45,48);
        s2.calculateAverage();
        s2.displayDetails();
    }
}
