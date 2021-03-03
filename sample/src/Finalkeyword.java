
public class Finalkeyword {
	public static void main(String[] args)
	{
		bike11 b = new bike11();
		//bike12 b = new bike12();
		//b.display();
		b.display();
		b.display2();
	}

}
/*final*/ class bike12
{
	int a=10;
	final int b=90;
	final void display()
	{
		//b=110
		a=110;
		System.out.println(a+" "+b);
	}
}
class bike11 extends bike12
{
	//void display()
	void display2()
	{
		System.out.println("hii...");
	}
}