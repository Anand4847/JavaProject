package JavaPractice;

public class Method1 {
	
	int a = 9;
	
	static int b =29;
	
	public void thismethod()
	{
		
		System.out.println("Calling from this method with class obj");
	}
	
	
	public static void thismethod1()
	{
		
		System.out.println("Calling from this method with method name");
	}
	
	
	
	public static void main(String[] args) {
		
		Method1 m = new Method1();
		m.thismethod();
		thismethod1();
		System.out.println(m.a);
		System.out.println(m.b);
	    Method2 n=new Method2();
	    n.secondmethod();
	    n.secondmethod1();
	    		
	}

}
