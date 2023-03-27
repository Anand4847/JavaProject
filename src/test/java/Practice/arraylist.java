package Practice;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("Testing");
		System.out.println(a);
		a.add("New");
		System.out.println(a);
		System.out.println(a.contains("Testing"));
		a.remove(0);
		System.out.println(a);
		a.add("Newton");

		System.out.println(a);
		a.add("Einstien");

		System.out.println(a);

		a.remove(2);
		System.out.println(a);
		a.add(1, "Anand");

		System.out.println(a);
		System.out.println(a.indexOf("Anand"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());

		System.out.println(a);
        
        
        a.remove(0);
		System.out.println(a);
		a.add("Mahesh");
		a.add("Dinesh");
		a.add("Sandeep");
		a.add("Priyank");
		a.add("Pratik");
		a.add("Ankit");
		System.out.println(a);
		a.remove(0);
		a.remove(0);
		System.out.println(a);
		a.add("Anand");
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("Priyank"));
        a.removeAll(a);        
        System.out.println(a);
        
        
        
        
	}
	

}
