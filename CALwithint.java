class CLA
{
	public static void main(String[]args)
	{
		int length=Integer.parseInt(args[0]);
		float breath=Float.parseFloat(args[1]);
		double perimeter=Double.parseDouble(args[2]);
		double result= length+breath+perimeter;
		System.out.println("The result is"+result);
	}
}