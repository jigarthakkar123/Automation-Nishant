interface ifs1
{
	void meth1();
}
interface ifs2
{
	static void meth2()
	{
		System.out.println("Meth2 In Interface");
	}
}

public class InterfaceDemo implements ifs1,ifs2{

	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo();
		i.meth1();
		ifs2.meth2();
	}

	public void meth1() {
		System.out.println("Meth1");
	}
	
}
