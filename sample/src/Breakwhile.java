
public class Breakwhile {
	public static void main(String[] args)
	{
		int var = 12;
		while(var<20)
		{
			System.out.println("variable is : "+var);
			if(var==15)
			{
				break;
			}
			var++;
		}
		System.out.println("out of while-loop");
	}

}
