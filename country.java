package Country;
public class country {
private String cname;
public country()
{
	
}
public country(String cname)
{
	this.cname=cname;
}
public String getCname() {
		return cname;
}
public void setCname(String cname) {
		this.cname = cname;
}
public String toString() {
		return "country [cname=" + cname + "]";
}


}
