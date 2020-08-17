import java.awt.*;

   class Framepane1{
   
     private Frame f;
	 
	 private Panel pan;

	 public Framepane1(String title){
	 
	 f=new Frame(title);
	 pan= new Panel();
	 
	 }	 
   
   public void launchframe(){
   
     f.SetSize(200,200);
	color c=new color(23,56,90);
	   f.SetBackground(c);
	   f.SetLayout(null);
	  pan.SetSize(100,100);
	 pan.SetBackground(color,yellow);
	 f.add(pan);
	 f.SetVisible(true);
   }
   
   public static void main(String args[]){
   
     Framepane1 fb =new Framepane1("frame with pane1");
	 
	  fb.launchFrame();
   }
   }