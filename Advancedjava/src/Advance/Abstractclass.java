package Advance;
abstract class Bank {
    abstract int getInterestRate();
}

class SBI extends Bank {
    int getInterestRate() {
        return 8;
    }
}

class HDFC extends Bank {
    int getInterestRate() {
        return 9;
    }
}

public class Abstractclass{
    public static void main(String[] args) {

        SBI s = new SBI();
        HDFC h = new HDFC();

        System.out.println("SBI Rate: " + s.getInterestRate());
        System.out.println("HDFC Rate: " + h.getInterestRate());
    }
}




