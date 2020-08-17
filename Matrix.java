import java.util.Scanner;
class Matrix
{
	
	static int a[][];
	
	static void read ()
{ Scanner sc= new Scanner( System.in);
	a=new int[2][2];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	
}	

public static void main(String[]args)
{
	read();
	for (int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
	}
}	
}