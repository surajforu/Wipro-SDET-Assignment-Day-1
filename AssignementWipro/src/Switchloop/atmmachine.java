package Switchloop;

public class atmmachine {

	public static void main(String[] args) {
		int choice = 3, bal = 5000;

		switch(choice){
		    case 1: System.out.println("Balance: "+bal); break;
		    case 2: bal += 500; System.out.println("Deposited"); break;
		    case 3: bal -= 200; System.out.println("Withdrawn"); break;
		    case 4: System.out.println("Exit"); break;
		}

	}

}
