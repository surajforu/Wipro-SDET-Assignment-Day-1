package Advance;
import java.util.*;
public class List_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8};
List<Integer> list=new ArrayList<Integer>();//object
ArrayList<Integer> list1=new ArrayList<Integer>();
   list.add(9);
   list.add(0);
   list.add(0);
 list.remove((Integer)9);
   System.out.println(list);
   System.out.println(list.indexOf(1));
   System.out.println(list.contains(9));
   System.out.println(list.isEmpty());
   System.out.println(list.lastIndexOf(null));
   System.out.println(list.get(2));
   System.out.println(list.getFirst());
   System.out.println(list.getLast());
   list.set(2,0);
   System.out.println(list);
   System.out.println(list.reversed());
 
	}

}
