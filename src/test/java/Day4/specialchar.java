package Day4;

public class specialchar {

	
	public static void main(String[] args) {
		
		
		String name = "Anandfe902j3&^(*&k";

		String reg=name.replaceAll("[^!@#$%^&&]","");

		System.out.println(reg);
	}
}
