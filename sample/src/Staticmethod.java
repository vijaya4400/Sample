
public class Staticmethod {
	public static void main(String[] args)
	{
		method();
		Staticmethod st = new Staticmethod();
		st.display();
	}


	static int i=43;
	static String s ="hi";
	static void method()
	{
		System.out.println("i:"+i);
		System.out.println("s:"+s);
	}
	void display()
	{
		method();
	}

}