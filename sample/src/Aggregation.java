
public class Aggregation 
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		double res=c1.area(4);
		System.out.println("result is: "+res);
	}
	
}
class Operation
{
	int result(int n)
	{
		return n*n;
	}
}
class Circle
{
	//Operation op;
	double pi = 3.140;
	double area(int n)
	{
		Operation op = new Operation();
		int radius=op.result(n);
		return pi*radius;
	}
	
}
