package personal;
import Country.country;
import state.state;
public class Person {
	
private String pname;
private country c1;
private state s1;
private int income;
private int age;
public Person(String pname, country c1, state s1, int income, int age) {

	this.pname = pname;
	this.c1 = c1;
	this.s1 = s1;
	this.income = income;
	this.age = age;
}
public Person()
{
	
}


public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public country getC1() {
	return c1;
}
public void setC1(country c1) {
	this.c1 = c1;
}
public state getS1() {
	return s1;
}
public void setS1(state s1) {
	this.s1 = s1;
}
public int getIncome() {
	return income;
}
public void setIncome(int income) {
	this.income = income;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Person [pname=" + pname + ", c1=" + c1 + ", s1=" + s1 + ", income=" + income + ", age=" + age + "]";
}

}
