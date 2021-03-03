
public class Ternary {
	public static void main(String[] args)
	{
		int x=40,y=30,z=15;
		int result = (x<y)?(x<z?x:z):(y>z?y:z);
		System.out.println(result);
	}

}
