package Practice;

public class Child extends Parent {
	
	public void colour()
	
	{
	    System.out.println(colour);
	    System.out.println(number);
	}
	
	public void childcall()
	
	{
		System.out.println("Child is called");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Child cp=new Child();
		cp.colour();
		cp.callone();
		cp.calltwo();
		
	}

}
