package Assignmentday_nine;

public class ABC_sequence {

	    public static void main(String[] args) {

	        Thread t1 = new Thread(() -> {
	            for(int i=1; i<=5; i++)
	                System.out.print("A ");
	        });

	        Thread t2 = new Thread(() -> {
	            for(int i=1; i<=5; i++)
	                System.out.print("B ");
	        });

	        Thread t3 = new Thread(() -> {
	            for(int i=1; i<=5; i++)
	                System.out.print("C ");
	        });

	        t1.start();
	        t2.start();
	        t3.start();
	    }
	}


