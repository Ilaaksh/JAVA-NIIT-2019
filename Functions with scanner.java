import java .util.Scanner;
class MyClass
{
 private void display(int x,int y)
{
int sum=0;
sum=x+y;
return sum;
System.out.println(sum);
}
private void show (int x, int y)
{
	int sub=0;
	sub=x-y;
	return sub;
	System.out.println(sub)
}
private void hello (int x, int y)
{
	int mul=0;
	mul=x*y;
	return mul
	System.out.println(mul)
}
private void bye (int x, int y)
{
	int div=0;
	div=x/y;
	return div
	System.out.println(div)
}
private static void main(String[]args)
{
Scanner myobj=new Scanner();
myobj.display(x,y);
myobj.show(x,y);
myobj.hello(x,y);
myobj.bye(x,y)
}
}