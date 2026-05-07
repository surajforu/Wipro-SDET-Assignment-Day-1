package Switchloop;

public class Countdigit {

	public static void main(String[] args) {
		int n=123456456,c=0;
		while(n>0){ c++; n/=10; }
		System.out.println(c);
	}

}
