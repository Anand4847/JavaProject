package Practice;

public class thiskeyword extends supercall {
	
	int a=4;
	
	public void callthis()
	
	{
		double a=45.26;
		System.out.println(super.a);
		System.out.println(a);
		System.out.println(this.a);
	
		System.out.println(a+this.a);
	}
	
	public static void main(String[] args) {
		
		
		thiskeyword tk = new thiskeyword();
		tk.callthis();
		
	}

}
