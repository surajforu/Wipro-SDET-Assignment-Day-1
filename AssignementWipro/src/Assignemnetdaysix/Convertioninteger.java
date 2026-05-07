package Assignemnetdaysix;

public class Convertioninteger {

	    static void change(int a) {
	        a = a * 2;
	        System.out.println("Inside: " + a);
	    }

	    public static void main(String[] args) {

	        int num = 7;

	        System.out.println("Before: " + num);

	        change(num);

	        System.out.println("After: " + num);
	    }
	}