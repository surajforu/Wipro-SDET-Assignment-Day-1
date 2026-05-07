package Switchloop;

public class Armstrongno {

	public static void main(String[] args) {
		int n=153,temp=n,s=0;
		while(n>0){ int d=n%10; s+=d*d*d; n/=10; }
		System.out.println(temp==s?"It is Armstrong":"It is Not");
	}

}
