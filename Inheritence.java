class Parent
{
		void parentmethod()
		{
			System.out.println("i am a simple method of parent class");
		}
}
class Child1 extends Parent
{
		void child1method()
		{
			System.out.println("i am a method of Child1 class");
		}
}
class Child2 extends Parent
{
		void child2method()
		{
			System.out.println("i am a method of Child2 class");
		}
}
class Data2
{
	public static void main(String args[])
	{
		Child1 chobj=new Child1();
		chobj.child1method();
		Child2 ch2obj=new Child2();
		ch2obj.child2method();
		chobj.parentmethod();
	}
}