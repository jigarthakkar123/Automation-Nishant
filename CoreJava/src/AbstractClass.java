abstract class abs1
{
	void meth1()
	{
		System.out.println("Meth1");
	}
	abstract void meth2();
}
class abs2 extends abs1
{
	void meth2() {
		System.out.println("Meth2 In Abs2");
	}
}
class abs3 extends abs1
{
	void meth2() {
		System.out.println("Meth2 In Abs3");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		abs2 a=new abs2();
		a.meth1();
		a.meth2();
		
		abs3 a1=new abs3();
		a1.meth1();
		a1.meth2();
	}
}
