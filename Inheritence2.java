class GrandParent
{
		void Grandparentmethod()
		{
			System.out.println("i am a simple method of GrandParent");
		}
}
class Parent extends GrandParent
{
		void Parentmethod()
		{
			System.out.println("i am a method of Parent class");
		}
}
class Child extends Parent
{
		void childmethod()
		{
			System.out.println("i am a method of Child class");
		}
}
class Data3
{
	public static void main(String args[])
	{
		Child chobj=new Child();
		chobj.childmethod();
		chobj.Parentmethod();
		chobj.Grandparentmethod();
	}
}