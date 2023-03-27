package Practice;

public class FuncOverloading {
	
	
public void calling()

{
	
	System.out.println("Calling from parent");
}
	
	
public void getData(int a)

{
	
	System.out.println(a);
}

public void getData(int a, int b)

{
	
	System.out.println(a);
}

public void getData(int b, int c, String d)

{
	
	System.out.println(d);
}

public void getData(String a)

{
	
	System.out.println(a);
}
public static void main(String[] args) {
	
	
	FuncOverloading fd = new FuncOverloading();
	fd.getData(9);
	fd.getData(4, 5);
	fd.getData(0, 0, "Tester");
	fd.getData("Anand");
	
}

}
