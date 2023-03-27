package Practice;

public class def1 {

	
	public void getdata()
	
	{
		
		System.out.println("Call");
	}
	
	protected void newdata()
	
	{
		
		System.out.println("Protected call");
	}
	
	public static void main(String[] args) {
		
		def1 d =new def1();
		d.getdata();
		
		
	}
}
