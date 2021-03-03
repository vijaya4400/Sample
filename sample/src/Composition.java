import java.io.*;
import java.util.*;
public class Composition {
	public static void main(String[] args)
	{
		Mobile m1 = new Mobile("Vivo",128,15000);
		Mobile m2 = new Mobile("Oppo",64,12000);
		Mobile m3 = new Mobile("Oneplus",256,48000);
		List<Mobile> mbs = new ArrayList<Mobile>();
		mbs.add(m1);
		mbs.add(m2);
		mbs.add(m3);
		Mobilestore ms = new Mobilestore(mbs);
		List<Mobile> phone = ms.totalMobiles();
		for(Mobile m:phone)
		{
			System.out.println("Name of the mobile : "+m.name+" internal storage : "+m.storage+"gb"+" cost of the mobile : "+m.price);
		}
	}
}
class Mobile
{
	String name;
	int storage;
	int price;
	Mobile(String name,int storage,int price)
	{
		this.name=name;
		this.storage=storage;
		this.price=price;
	}
}
class Mobilestore
{
	List<Mobile> mobiles;
	Mobilestore(List<Mobile> mobiles)
	{
		this.mobiles=mobiles;
	}
	List<Mobile> totalMobiles()
	{
		return mobiles;
	}
}