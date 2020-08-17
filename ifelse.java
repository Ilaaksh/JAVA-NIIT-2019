class M
{
public static void main(String[]args)
{
int ch=2;
int num1=22;
int num2=2;
int ans;
if(ch==1)
{
ans=num1+num2;
System.out.println(ans);
}
else if(ch==2)
{
ans=num1-num2;
System.out.println(ans);
}
else if(ch==3)
{
ans=num1*num2;
System.out.println(ans);
}
else if(ch==4)
{
ans=num1/num2;
System.out.println(ans);
}
else
{
System.out.println("Not Valid");
}
}
}