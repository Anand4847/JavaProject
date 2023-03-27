package JavaPractice;

public class Methods {
	
	
	public void calldata() {
		
		System.out.println("Call get data with class object");
	}
	
	public static void newdata()
	
	{
		
		System.out.println("Call new data directly with method name");
	}
	
	public int number(int a)
	
	{
		System.out.println("Returning the number with Class object " + a);
		
		return 7;
	}
	
public static String number(String b)
	
	{
		System.out.println("Returning the String with method name " + b);
		
		return "Soni";
	}
	
	public static void main(String[] args) {
		
		Methods m= new Methods();
		m.calldata();
		newdata();
		m.number(7);
		number("Soni");
	}

}
