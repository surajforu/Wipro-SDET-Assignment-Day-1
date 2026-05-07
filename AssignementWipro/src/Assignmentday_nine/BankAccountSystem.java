package Assignmentday_nine;

public class BankAccountSystem {

	    static int balance = 1000;

	    public static void main(String[] args) {

	        Thread deposit = new Thread(() -> {

	            balance += 500;
	            System.out.println("Balance: " + balance);
	        });

	        Thread withdraw = new Thread(() -> {

	            balance -= 200;
	            System.out.println("Balance: " + balance);
	        });

	        deposit.start();
	        withdraw.start();
	    }
	}

