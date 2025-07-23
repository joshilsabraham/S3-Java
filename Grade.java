import java.util.Scanner;

class Student {
    int english;
    int maths;
    int science;

    public void inputMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter English marks: ");
        english = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        maths = sc.nextInt();
        System.out.print("Enter Science marks: ");
        science = sc.nextInt();
    }

    public void calculate() {
        int marks = (english + maths + science) / 3;
        System.out.println("Average marks: " + marks);
        if(marks>=90) {
			System.out.print("Grade A");
		}
		else if(marks <90 && marks >=75) {
			System.out.print("Grade B");
	    }
		else if(marks<75 && marks>=60) {
			System.out.print("Grade C");
		}
		else if(marks<60 && marks>=40) {
			System.out.print("Grade D");
		}
		else {
			System.out.print("Fail");  
		}
    }
}

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter Marks");
        Student s1 = new Student();
        s1.inputMarks();
        s1.calculate();
      
    }
}
