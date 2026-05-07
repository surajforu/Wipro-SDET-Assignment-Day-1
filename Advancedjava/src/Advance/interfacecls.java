package Advance;
interface Test {
    void divide();
}

class assignment implements Test {

    public void divide() {

        try {
            int a = 10 / 0;
            System.out.println(a);
        }

        catch (Exception e) {
            System.out.println("Exception has been Handled");
        }
    }
}

public class interfacecls {
    public static void main(String[] args) {

    	assignment d = new assignment();
        d.divide();
    }
}
