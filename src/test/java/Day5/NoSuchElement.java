package Day5;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class NoSuchElement{
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int num;

	        try {
	            System.out.print("Enter a number: ");
	            num = scanner.nextInt();
	            System.out.println("You entered: " + num);
	        } catch (NoSuchElementException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	}

	
