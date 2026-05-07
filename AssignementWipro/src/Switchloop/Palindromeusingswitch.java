package Switchloop;

public class Palindromeusingswitch {

	public static void main(String[] args) {
		int n=121,temp=n,r=0;
		while(n>0){ r=r*10+n%10; n/=10; }
		System.out.println(temp==r?"Palindrome":"Not");
	}

}
