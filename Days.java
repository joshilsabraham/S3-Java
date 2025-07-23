import java.util.Scanner;

public class Days {
	 public static void main(String[] args) {
		 int day;
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter An Integer(1-7): ");
	     day = sc.nextInt();
		 System.out.print("The Corresponding Day is " );
         switch (day) {
         case 1:
           System.out.print("Monday");
           break;
         case 2:
           System.out.print("Tuesday");
           break;
         case 3:
           System.out.print("Wednesday");
           break;
         case 4:
           System.out.print("Thursday");
           break;
         case 5:
           System.out.print("Friday");
           break;
         case 6:
           System.out.print("Saturday");
           break;
         case 7:
           System.out.print("Sunday");
	       break;
	     }
	 }    
}
