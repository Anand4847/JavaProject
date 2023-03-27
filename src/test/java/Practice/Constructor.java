package Practice;

public class Constructor {

	public Constructor()

	{
		
		System.out.println("I am default constructor");

	}

	public Constructor(String a)

	{
		System.out.println("I am in the parameterized Constructor");
		
       System.out.println(a);
	}
	
	public Constructor(String e, int c)

	{
		System.out.println("I am in another parameterized Constructor");
		
       System.out.println(e);
       System.out.println(c);
	}

	public Constructor(int r, int m)

	{
		System.out.println("I am calling sum");
		
		int k= r+m;
       System.out.println(k);
	}


	

	public static void main(String[] args) {

		Constructor ct = new Constructor();
        Constructor par = new Constructor("So call Anand");
        Constructor ctr = new Constructor("So call Amit", 26);
		Constructor cta = new Constructor(28, 26);
	}

}
