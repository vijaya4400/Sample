
public class Animal {
	public static void main(String[] args)
	{
		Body b1 = new Body1();
		b1.test();
		b1.inside();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
	}
}
	abstract class Body                                                                                    
	{
		abstract void inside();
		void test()
		{
			System.out.println("non abstract method is shown..");
		}
	} 
	class Body1 extends Body
	{                                                                                 
		void inside()
		{
			System.out.println("body should be hidded...");
		}
	}