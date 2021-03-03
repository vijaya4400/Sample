
public class Association {
	public static void main(String[] args)
	{
		Institue i = new Institue("Malla Reddy Engineering College");
		Student s = new Student("vijaya");
		System.out.println(s.getName()+" was studying in "+i.getName());
	}

}
class Institue
{
	String institueName;
	Institue(String institueName)
	{
		this.institueName=institueName;
	}
	String getName()
	{
		return institueName;
	}
}
class Student
{
	String studentName;
	Student(String studentName)
	{
		this.studentName=studentName;
	}
	String getName()
	{
		return studentName;
	}
}