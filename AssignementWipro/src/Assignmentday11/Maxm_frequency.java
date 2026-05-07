package Assignmentday11;

	import java.util.*;

	public class Maxm_frequency {
	    public static void main(String[] args) {

	        int a[] = {1,2,2,3,3,3,4,5,5,5,5};

	        HashMap<Integer,Integer> map = new HashMap<>();

	        for(int n : a) {

	            if(map.containsKey(n))
	                map.put(n, map.get(n)+1);
	            else
	                map.put(n, 1);
	        }

	        int maxKey = 0, max = 0;

	        for(int k : map.keySet()) {

	            if(map.get(k) > max) {
	                max = map.get(k);
	                maxKey = k;
	            }
	        }

	        System.out.println(maxKey);
	    }
	}

