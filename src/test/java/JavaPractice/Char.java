package JavaPractice;

public class Char {

public static void main(String[] args) {
	
	
//charat
//indexof
//substring 2
//concat
//trim
//length
//uppercase
//lowercase
//splitwith array

	
	String name = "javaTRaining";
	
	System.out.println(name.charAt(5));
	System.out.println(name.indexOf("g"));
	System.out.println(name.substring(5));
	System.out.println(name.substring(1, 7));
	System.out.println(name.concat(" for Selenium"));
	System.out.println(name.trim());
	System.out.println(name.length());
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	String arr[]=name.split("T");
    System.out.println(arr[0]);	
    System.out.println(arr[1]);	
	
			
	
	
	
	
	
	
	
	
}	
	
}
