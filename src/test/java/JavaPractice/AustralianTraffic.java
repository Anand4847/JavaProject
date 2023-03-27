package JavaPractice;

public class AustralianTraffic implements CentralTraffic, ContinentTraffic {

	public static void main(String[] args) {
		
		CentralTraffic a= new AustralianTraffic();
		a.greengo();
		a.flashyellow();
		a.redstop();
		
		
		AustralianTraffic b =new AustralianTraffic();
		b.walking();
		
		ContinentTraffic  c =new AustralianTraffic();
		c.Trainsymbol();
	}

	public void walking()
	
	{
		
		System.out.println("I will print walking");
	}
	
	@Override
	public void greengo() {
		
	System.out.println("I will print green");	
	}

	@Override
	public void redstop() {
		System.out.println("I will print red");		
		
	}

	@Override
	public void flashyellow() {
		
		System.out.println("I will print yellow");	
	}

	@Override
	public void Trainsymbol() {
		
		System.out.println("I will call train");
		
	}
}
