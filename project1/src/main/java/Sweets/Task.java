package Sweets;
import java.util.ArrayList;
public class Task {
	 ArrayList<Sweet> l1 = new ArrayList<Sweet>(); 
	 
	 public Task()
	 {
		l1.add(new Sweet1("ladoo",3.6F,5.3F,3.6F,"yellow",10));
		l1.add(new Sweet2("candy",3.1F,4.23F,1.6F,"red",15));
		l1.add(new Sweet3("jalebi",1.6F,2.3F,2.16F,"pink",8));
		l1.add(new Sweet1("Kulfy",7.23F,1.3F,2.3F,"white",6));
		l1.add(new Sweet2("Basundi",3.12F,5.3F,2.2F,"white",1));
	 }
	public int calculateTotalWeight() {
		int value = 0;
		for (Sweet s :l1) {
			value+= s.getCount() * s.getWeight();
		}
		return value;
	}
	ArrayList<Sweet> l2 = new ArrayList<Sweet>(); 
	public void sortbyCount()
	{
		for(Sweet s:l1)
		{
			int min=s.getCount();
			Sweet obj1=s;
			for(Sweet s1:l1)
			{
				if(s1.getCount()<min)
				{
					min=s1.getCount();
					obj1=s1;
				}
			}
			l2.add(obj1);
		}
	}
	Task t1=new Task();
	public void display()
	{
		System.out.println("Total weights of sweets is"+t1.calculateTotalWeight());
		System.out.println("Sweets sorted according to sweet count is :");
		for(Sweet s2:l2)
		{
			System.out.println(s2.getSweetName()+" "+s2.getSweetColor()+" "+s2.getSugarQuantity()+" "+s2.getSweetPrice()+" "+s2.getWeight()+" "+s2.getCount());	
		}
	}
}