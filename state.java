package state;
public class state {
private String sname;
public state()
	{
		this.sname="";
	}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public state(String sname)
	{
		super();
		this.sname=sname;
	}
//@Override
public String toString() {
	return "state [sname=" + sname + "]";
}
}