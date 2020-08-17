import java .util.Scanner;
class Saahil
{
	public static void main (String []args)
	{
		Scanner sc=new Scanner(System.in);
		int d,a,r;
		System.out.println("Please enter prices");
		d= sc.nextInt();
		r=sc.nextInt();
	       a= d*72;
		   
		if (a<r)
		{
			System.out.println("Dollor will be the wiser choice");
		}
		else
		{
			System.out.println("Ruppees is a better choice");
		}
	}	
}
		