class Details {
    String name;
    int age;  
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.print("Age: " + age);
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
