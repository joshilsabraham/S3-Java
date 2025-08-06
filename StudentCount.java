class Student {
	String name;
	static int studentCount=0;
	Student(String name){
		this.name=name;
		studentCount++;
	}
	public static int getStudentCount(){
		return studentCount;
	}
}

public class StudentCount {
	public static void main(String[] args) {
		Student s1=new Student("Joe");
		Student s2=new Student("John");
		Student s3=new Student("Jack");
		int total=Student.getStudentCount();
		System.out.println("Number of Students: " + total);
	}
}
