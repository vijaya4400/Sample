
public class Constructor1 {
	public static void main(String[] args)
	{
		Details d = new Details("vinnu",1234,6091256);
		d.display();
	}
}
class Details
{
	String name;
	int rollno;
	long mobileno;
	Details(String n,int r,long m)
	{
		name=n;
		rollno=r;
		mobileno=m;
	}
	void display()
	{
		System.out.println(name+" "+rollno+" "+mobileno);
	}
	
}
