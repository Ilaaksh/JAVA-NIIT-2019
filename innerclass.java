class Outer
{
	void par()
	{
		Inner ch=new Inner();
		//ch.InnerMethod();
		System.out.println("Hello i am Outer class method");
	}

class Inner 
{
	Inner()
	{
		//super();
		System.out.println("Hello i am the Inner class constructor ");
	}
}
}

class Demo
{
	public static void main(String[]args)
	{
			Outer p=new Outer();
			p.par();
			
	}
}