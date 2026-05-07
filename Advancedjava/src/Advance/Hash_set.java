package Advance;
import java.util.*;
public class Hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<String> set =new HashSet<String>();
set.add("mango");
set.add("Apple");
set.add("kiwi");
set.add("orange");
set.add("litchi");
set.add(null);
set.add(null);
System.out.println(set);
System.out.println(set.equals("orange"));
set.remove("kiwi");
System.out.println(set);
Iterator<String> itr=set.iterator(); 
while(itr.hasNext()){
System.out.println(itr.next());
}
	}

}
