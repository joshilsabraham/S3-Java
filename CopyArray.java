package jxh;
import java.util.Scanner;

public class CopyArray {
		    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	
	        System.out.print("Enter number of Elements: ");
	        int elements = sc.nextInt();
	
	        int[] array = new int[elements];
	        System.out.println("Enter the Array Elements: ");
	
	        for (int i = 0; i < elements; i++) {
	                array[i] = sc.nextInt();
	        }
	
	        int[] copy = new int[elements];
	        for (int i = 0; i < elements; i++) {
	            	array[i] = copy[i];
	        }
	        
	        System.out.println("Original Array:");
	        for (int i = 0; i < elements; i++) {
	                System.out.print(array[i] + "\t");
	        }
	        
	        System.out.println("Copy of the Array:");
	        for (int i = 0; i < elements; i++) {
	                System.out.print(copy[i] + "\t");
	            }
	            System.out.println();
	    }
	}
