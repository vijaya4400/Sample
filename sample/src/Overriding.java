
public class Overriding {
	public static void main(String[] args)
	{
		Test3 t1 = new Test2();
		//Test2 t2= new Test2();
		System.out.println(t1.test1(11,2));
		 //System.out.println(t2.test1(11,2));
	}
}
	 class Test3
	 {
		 public static int test1(int a,int b)
		 {
			return a+b;
		 }
	 }
	 class Test2 extends Test3
	 {
		 public static int test1(int a,int b)
		 {
			 return a*b;
		 }
	 }