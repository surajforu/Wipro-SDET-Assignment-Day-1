package Adv_Assignmentwipro;
import java.util.*;

public class online_shoping_cart {

	
	    public static void main(String[] args) {

	        List<String> cart = new ArrayList<>();

	        Map<String,Integer> price = new HashMap<>();

	        price.put("Book", 300);
	        price.put("Pen", 20);
	        price.put("pencil", 10);

	        cart.add("Book");
	        cart.add("Pen");
	        cart.add("pencil");

	        int total = 0;

	        for(String item : cart){
	            total += price.get(item);
	        }

	        System.out.println("Cart: " + cart);
	        System.out.println("Total Price: " + total);
	    }
	}

