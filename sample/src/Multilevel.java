
public class Multilevel {
	public static void main(String[] args)
	{
		Chair2 c2 = new Chair2();
		c2.display();
		c2.display1();
		c2.display2();
	}

}
class Table
{
	void display()
	{
		System.out.println("table class...");
	}
}
class Chair1 extends Table
{
	void display1()
	{
		System.out.println("chair1 class...");
	}
}
class Chair2 extends Chair1
{
	void display2()
	{
		System.out.println("chair2 class....");
	}
}