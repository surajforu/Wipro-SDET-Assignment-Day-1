package Adv_Assignmentwipro;
import java.util.*;

public class Symmetric_difference {

	    public static void main(String[] args) {

	        HashSet<Integer> a = new HashSet<>();
	        a.add(1);
	        a.add(2);
	        a.add(3);
	        a.add(4);

	        HashSet<Integer> b = new HashSet<>();
	        b.add(3);
	        b.add(4);
	        b.add(5);
	        b.add(6);

	        for(int x : a) {

	            if(!b.contains(x))
	                System.out.print(x + " ");
	        }

	        for(int x : b) {

	            if(!a.contains(x))
	                System.out.print(x + " ");
	        }
	    }
	}

