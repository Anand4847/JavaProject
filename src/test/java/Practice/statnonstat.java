package Practice;

public class statnonstat {
	
	String city ;
	String address;
	static String name = "Anand";
	static int age = 25;
	
	statnonstat (String city, String address)
	
	{
		
		this.city = city;
		this.address = address;
		
		
	}
	
public static void calldata() {
		
		System.out.println(age);
	}
	
	
	public void getdata() {
		
		System.out.println(city + " " + address + " " + name);
	}
	
	public static void main(String[] args) {
		
		statnonstat obj = new statnonstat("Navsari,", "Zaveri Sadak,");
		statnonstat obj1 = new statnonstat("Mandvi,", "Soni Faliya,");
		obj.getdata();
		obj1.getdata();
        calldata();
		statnonstat.calldata(); 
	}

}
