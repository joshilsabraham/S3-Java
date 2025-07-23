package jxh;

import java.util.Scanner;

class Details {
    String name;
    int age;
    public void displayDetails() {
        System.out.print(name);
        System.out.print(age);
    }
}

public class Student {
    public static void main(String[] args) {
        Details s1= new Details();
        s1.name="Jacob";
        s1.age=19;
        s1.displayDetails();
    }
}
