import java.util.*;
 
 class ArrayListClass{
 
 public static void main(String args[]){
 
 List<Integer> partList = new ArrayList<>(3);
 
 partList.add(new Integer(1111));
 
 partList.add(new Integer(2222));
 
 partList.add(new Integer(3333));
 
 partList.add(new Integer(4444));

 System.out.println("First part:" +partList.get(0));
 
 partList.add(0,new Integer(5555));
 
 System.out.println(partList);

 }
 }