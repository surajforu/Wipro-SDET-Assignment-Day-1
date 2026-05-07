package Adv_Assignmentwipro;
import java.util.*;

public class Commonelements {

	    public static void main(String[] args) {

	        HashSet<Integer> s1 = new HashSet<>();
	        s1.add(1);
	        s1.add(2);
	        s1.add(3);
	        s1.add(4);

	        HashSet<Integer> s2 = new HashSet<>();
	        s2.add(2);
	        s2.add(3);
	        s2.add(4);
	        s2.add(5);

	        for(int x : s1) {

	            if(s2.contains(x))
	                System.out.print(x + " ");
	        }
	    }
	}

