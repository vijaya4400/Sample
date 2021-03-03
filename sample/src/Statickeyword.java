
public class Statickeyword {
	public static void main(String[] args)
	{
		Student2 s1 = new Student2("vijaya",1476);
		s1.display();
	}
}
class Student2
{
	String sname;
	static String collegename="MREC";
	int rollno;
	Student2(String sname,int rollno)
	{
		this.sname=sname;
		this.rollno=rollno;
	}
	void display()
	{
		System.out.println(sname+" "+rollno+" "+collegename);
	}
}
