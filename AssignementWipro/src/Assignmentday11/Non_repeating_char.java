package Assignmentday11;

	import java.util.*;

	public class Non_repeating_char {
	    public static void main(String[] args) {

	        String s = "aabbcd";

	        HashMap<Character,Integer> map = new HashMap<>();

	        for(char ch : s.toCharArray()) {

	            if(map.containsKey(ch))
	                map.put(ch, map.get(ch)+1);
	            else
	                map.put(ch, 1);
	        }

	        for(char ch : s.toCharArray()) {

	            if(map.get(ch)==1) {
	                System.out.println(ch);
	                break;
	            }
	        }
	    }
	}

