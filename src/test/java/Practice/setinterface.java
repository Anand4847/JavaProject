package Practice;

import java.util.HashSet;

public class setinterface {
	
// Classes of set interface are hashset, treeset and linkedhashset
// it does not return the duplicate values

	public static void main(String[] args) {
		
		
		
	
HashSet<String > h = new HashSet<String>();
h.add("Anand");
h.add("Pinku");
h.add("Ankit");
System.out.println(h);
h.remove("Pinku");
System.out.println(h);
System.out.println(h.contains("Anand"));
h.add("Anand");
h.add("Ankita");
System.out.println(h);


	}

}
