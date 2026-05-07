package Switchloop;

public class Fibonaciino {

	public static void main(String[] args) {
		int n=5,a=0,b=1,i=1;
		while(i<=n){
		    System.out.print(a+" ");
		    int c=a+b;
		    a=b; b=c;
		    i++;
		}
	}

}
