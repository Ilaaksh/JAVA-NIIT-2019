import java.awt.*;
 class MenuBar{
 
 Frame f;
 MenuBar mb;
  
  MenuExample()
  {
 f=new Frame("MenuBar");
mb=new MenuBar();

Menu m1=new Menu("File"); 
Menu m2=new Menu("Edit"); 
Menu m3=new Menu("Help"); 
  mb.add(m1);
  mb.add(m2);
  mb.setHelpMenu(m3);
  
  f.setMenuBar(mb)
  
  MenuItem mi1=new MenuItem("New");
  MenuItem mi2=new MenuItem("save");
  MenuItem mi3=new MenuItem("load");
  MenuItem mi4=new MenuItem("quit");
  
   m1.add(mi1);
   m1.add(mi2);
   m1.add(mi3);
   m1.addSeparate();
   m1.add(mi4);
  
  CheckboxMenuItem mi5= CheckboxMenuItem("persistence");
  m1.add(mi5);
  
  }

public void display(){

f.setVisible(True);
}
public static void main(String args[]){

MenuExample m=new MenuExample();
m.display();
}
  
 }