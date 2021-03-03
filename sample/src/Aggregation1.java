
public class Aggregation1 {
	public static void main(String[] args)
	{
		Address a1 = new Address("nzb","Telangana","India");
		Address a2 = new Address("krishna","Andrapradesh","India");
		Address a3 = new Address("bandra","Mumbai","India");
		Emp e1 = new Emp(11,"vijaya",a1);
		Emp e2 = new Emp(45,"vinay",a2);
		Emp e3 = new Emp(111,"Govinda",a3);
		e1.empDetails();
		e2.empDetails();
		e3.empDetails();
	}

}
class Address
{
	String city,state,country;
	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
class Emp
{
	int id;
	String name;
	Address address;
	Emp(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void empDetails()
	{
		System.out.print(id+" "+name);
		System.out.println(" "+address.city+" "+address.state+" "+address.country);
	}
}