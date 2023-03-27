package Practice;

public class FuncOverriding extends FuncOverloading{

	
	public void calling()
	
	{
		
		System.out.println("Calling from child");
	}
	
	public static void main(String[] args) {
		
		FuncOverriding df= new FuncOverriding();
		df.calling();
		
		
	}
}
