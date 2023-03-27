package Practice;

public class childsuper extends parentsuper{
	
	String name = "Pappu";
	
public  childsuper()
	
	{ 
	super();

	System.out.println("I am child constructor");
	
	}
	
	

	public void calldata()
	
	{
		String name = "Kanu";
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(this.name);
	}
	
	
	
	public static void main(String[] args) {
		
		
		childsuper cd= new childsuper();
		cd.calldata();
		
				
	}

}
