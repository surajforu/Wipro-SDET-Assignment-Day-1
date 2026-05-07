package Assignemnetdaysix;

 
	interface Calc {
	    int operation(int a, int b);
	}

public class lamdacalc {
	    public static void main(String[] args) {

	    
	        Calc add = (a, b) -> a + b;
	        Calc sub = (a, b) -> a - b;
	        Calc mul = (a, b) -> a * b;
	        Calc div = (a, b) -> a / b;

	        System.out.println("Add: " + add.operation(10, 5));
	        System.out.println("Sub: " + sub.operation(10, 5));
	        System.out.println("Mul: " + mul.operation(10, 5));
	        System.out.println("Div: " + div.operation(10, 5));
	    }
	}

