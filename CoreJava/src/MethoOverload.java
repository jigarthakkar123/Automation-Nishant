public class MethoOverload {

	void test()
	{
		System.out.println("test with no argument");
	}
	void test(int a)
	{
		System.out.println("test with 1 argument");
	}
	void test(int a,int b)
	{
		System.out.println("test with 2 argument");
	}
	
	public static void main(String[] args) {
		MethoOverload m=new MethoOverload();
		m.test(10);
		m.test();
		m.test(1,2);
	}
}
