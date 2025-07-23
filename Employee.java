class Detail {
    String name;
    int id;
    double salary;
    
    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    
    Detail(String name,int id,double salary){
    	  this.name=name;
    	  this.id=id;
    	  this.salary=salary;
    }
}

public class Employee {
    public static void main(String[] args) {
        Detail e1= new Detail("Kritthik",101,50000);
        e1.displayEmployee();
        Detail e2= new Detail("Syril",102,40000);
        e2.displayEmployee();
    }
}
