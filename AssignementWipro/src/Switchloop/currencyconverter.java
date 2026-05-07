package Switchloop;

public class currencyconverter {

	public static void main(String[] args) {
		int ch = 1;
		double inr = 100;

		switch(ch){
		    case 1: System.out.println("USD: "+inr/83); break;
		    case 2: System.out.println("EUR: "+inr/90); break;
		}
	}

}
