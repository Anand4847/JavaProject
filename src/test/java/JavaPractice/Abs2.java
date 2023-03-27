package JavaPractice;

public class Abs2 extends Abs1 {

	public static void main(String[] args) {
		
		Abs2 c= new Abs2();
		c.engine();
		c.colour();
		c.safety();
		
	}

	@Override
	public void colour() {
		
		System.out.println("Guidelines for colour");
		
		
	}
}
