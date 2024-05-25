package personal;

import Country.country;
import state.state;

public class DemoPerson {

	public static void main(String arr[])
	{
		country c=new country("India");
		state s=new state("gujarat");
		Person p=new Person("pinki",c,s,90000,23);
		
		System.out.println(p);
		TaxCalculation tc=new TaxCalculation();
		tc.calculateTax(p);
		
		
		country c1 = new country();
		state s1=new state();
		Person p1=new Person();
		
		c1.setCname("India");
		s1.setSname("Gujarat");
		
		p1.setC1(c1);
		p1.setS1(s1);
		
		p1.setPname("payal");
		p1.setAge(18);
		p1.setIncome(200000);
		
		System.out.println(p1);
		
		tc.calculateTax(p1);
		
		
		
}
}
