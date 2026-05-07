package Assignmentday_nine;

	class Order extends Thread {

	    String name;

	    Order(String name) {
	        this.name = name;
	    }

	    public void run() {
	        System.out.println(name + " Delivered");
	    }
	}

	public class DeliveryFood {

	    public static void main(String[] args) {

	        Order o1 = new Order("Pizza");
	        Order o2 = new Order("Burger");
	        Order o3 = new Order("Cake");
	        Order o4 = new Order("Icecream");

	        o1.start();
	        o2.start();
	        o3.start();
	        o4.start();
	    }
	}

