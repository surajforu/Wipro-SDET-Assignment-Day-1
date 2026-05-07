package Adv_Assignmentwipro;
import java.util.*;

public class Secondlargestmo {

	    public static void main(String[] args) {

	        List<Integer> list = Arrays.asList(10, 20, 40, 30);

	        Collections.sort(list);

	        System.out.println(list.get(list.size()-2));
	    }
	}

