package Practice;


public class Method  {

	
static int a = 15;	
int b = 46;
	
public  void test()

{

	
	int b= 16;
	System.out.println("Test");
	System.out.println(b);
	System.out.println(this.b);
}
	

static int fs = 456;
int cc = 44;
public static void main(String[] args) {
	
	Method m=new Method();
	m.test();
	System.out.println(a);
	
	Method1 me = new Method1();
	me.newtest();
	
	Method1.newtester();
	
	
	int callr = me.r;
	System.out.println(callr);
	
	int callp = me.p;
	System.out.println(callp);
	
	int cc = m.fs;
	System.out.println(cc);
	
	int sdf = m.cc;
	System.out.println(sdf);
	
}	
	
	
	
	
}
