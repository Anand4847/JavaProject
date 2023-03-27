package Practice;

public class Stringchar {

	
public static void main(String[] args) {
	
String a= " javatraining";

System.out.println(a.charAt(3)); // finding the value of a particular char using index
System.out.println(a.indexOf("t"));	// finding the index of a particular char
System.out.println(a.substring(4, 8)); // finding the from and to char of a string
System.out.println(a.substring(5)); // starting from a particular index till the end
System.out.println(a.concat(" Selenium")); // adding the string to an existing string
System.out.println(a.length()); // finding the total length of a char
System.out.println(a.trim()); // for trimming the white space at initial
System.out.println(a.toUpperCase()); // for uppercase
System.out.println(a.toLowerCase()); // for lowercase
String arr[] = a.split("t"); //creating an array as it is an string
System.out.println(arr[0]); // it will give the first value
System.out.println(arr[1]); // it will give the second value
System.out.println(a.replace("t", "o"));





}	
	
}
