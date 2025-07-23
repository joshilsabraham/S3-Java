package jxh;

import java.util.Scanner;

class Student{
	int english;
	int maths;
	int science;
	public static void inputMarks() {
		Scanner sc=new Scanner(System.in);
		english=sc.nextInt();
		maths=sc.nextInt();
		science=sc.nextInt();
	}
	public static void calculate() {
		int marks= (english+maths+science)/3;
		System.out.println(marks);
	}
}

public class Grade {
	public static void main(String[]args) {		
		System.out.println("Enter Marks: ");
		Student s1=new Student();
		Student.inputMarks();
		Student.calculate();		
	}
}
