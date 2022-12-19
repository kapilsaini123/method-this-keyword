package pkg1;

public class Automation 
{
	public void m1()
	{
		this.m4(12, 23, 34);
		System.out.println("default method");
	}
	public void m2(int a)
	{
		this.m1();
		System.out.println("one parameterized method");
	}
	public void m3(int a,int b)
	{
		this.m2(12);
		System.out.println("two parameterized method");
	}
	public void m4(int a,int b,int c)
	{
		System.out.println("three parameterized method");
	}
	public void m5(int a,int b,int c,int d)
	{
		this.m3(12, 23);
		System.out.println("fourth parameterized method");
	}
	public static void main(String[] args) 
	{
		Automation ob=new Automation();
		ob.m5(12, 23, 23, 56);
	}


}
