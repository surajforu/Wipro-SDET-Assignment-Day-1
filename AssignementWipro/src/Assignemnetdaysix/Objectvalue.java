package Assignemnetdaysix;
class Box {
    int length = 5;
}
public class Objectvalue {
	    static void change(Box b) {
	        b.length = 20;
	    }

	    public static void main(String[] args) {

	        Box b = new Box();

	        System.out.println("Before: " + b.length);

	        change(b);

	        System.out.println("After: " + b.length);
	    }
	}

