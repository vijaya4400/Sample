
public class Singlelevel {
	public static void main(String[] args)
	{
		Babydog bd = new Babydog();
		bd.display();
		bd.display1();
	}

}
class Babydog1
{
	void display1()
	{
	System.out.println("dog is shouting...");
	}
}
class Babydog extends Babydog1
{
	void display()
	{
		System.out.println("Babydog barks...");
	}
}
