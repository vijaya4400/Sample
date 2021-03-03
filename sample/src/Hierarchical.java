
public class Hierarchical {
	public static void main(String[] args)
	{
		Y y = new Y();
		Z z = new Z();
		y.display();
		y.display1();
		z.display();
		z.display2();
	}

}
class X
{
	void display()
	{
		System.out.println("x class.....");
	}
}
class Y extends X
{
	void display1()
	{
		System.out.println("y class.....");
	}
}
class Z extends X
{
	void display2()
	{
		System.out.println("z class.....");
	}
}
