
public class Super {
	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.display();
	}

}
class Dog1
{
	String color = "white";
}
class Dog extends Dog1
{
	String color="black";
	void display()
	{
		//System.out.println(color);
		System.out.println(super.color);
	}
}
