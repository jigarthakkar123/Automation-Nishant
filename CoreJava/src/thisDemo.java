class Student
{
	int rno;
	String sname;
	public Student() {
		System.out.println("Default Constructor");
	}
	public Student(int rno,String sname) {
		this();
		this.rno=rno;
		this.sname=sname;
		System.out.println("Roll No : "+rno+"\nStudent Name : "+sname);
	}
}
public class thisDemo {

	public static void main(String[] args) {
		Student s1=new Student(1, "Jigar");
	}
}
