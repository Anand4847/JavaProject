package Day4;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String name = "Anand";
		String b = "";
		
		for (int i=name.length()-1; i>=0;i--)
			
		{
			
			b = b+name.charAt(i);
			
		}
		
		System.out.println(b);

		if (name.equalsIgnoreCase(b))
			
		{
			
			System.out.println("It is palindrome");
		}
		else
			
		{
			
			System.out.println("It is not palindrome");
		}
	}
	


}
