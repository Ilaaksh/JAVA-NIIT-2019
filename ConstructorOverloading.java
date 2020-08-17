class Employee
{
	Employee()
	{
		System.out.println("hello i am default constructor");
	}
	Employee(int a)
	{
		System.out.println("hello i am 1 argument constructor :"+a);
	}
	Employee(int a,int b)
	{
		System.out.println("hello i am 2 arguments constructor :"+(a+b));
	}
}
class Data
{
public static void main(String args[])
{
		Employee emp=new Employee();
		Employee emp1=new Employee(6);
		Employee emp2=new Employee(6,7);
}
}