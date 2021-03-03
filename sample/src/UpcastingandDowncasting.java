
public class UpcastingandDowncasting {
	public static void main(String[] args)
	{
		Machine m1 = new Camera();//upcasting the subclass
		m1.display();
		//m1.dispaly1();
		Machine m2 = new Camera();//downcasting the parentclass
		Camera c1 = (Camera)m2;
		c1.display1();
		c1.video();
		
	}
}
class Machine
{
	void display()
	{
		System.out.println("Machine is working..");
	}
	void display1()
	{
		System.out.println("machine is works...");
	}
}
class Camera extends Machine
{
	void display()
	{
		System.out.println("photo is caputred...");
	}
	void video()
	{
		System.out.println("photo is getting caputred");
	}
}