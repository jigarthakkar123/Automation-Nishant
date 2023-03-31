class A1
{
	void show()
	{
		System.out.println("Show From A1");
	}
}
class B1 extends A1
{
	void show()
	{
		super.show();
		System.out.println("Show From B1");
	}
}
class C1 extends B1
{
	void show()
	{
		super.show();
		System.out.println("Show From C1");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		C1 c=new C1();
		c.show();
	}
}
