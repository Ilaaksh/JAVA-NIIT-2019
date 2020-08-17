
class CurrentThreaddemo
{
	public static void main(String args[]){
		
		Thread t= Thread.currentThread();
		System.out.println("Current thread:"+t);
		t.setName("My thread");
		System.out.println("after name change:"+t);
	try {
		
	for(int n=0;n>0;n--){
		
		System.out.println(n);
		Thread.sleep(2000);
	}
	}
	catch(InterruptedException e)
	{
		
		System.out.println("main method Interrupted");
	}
		
		
	}
}