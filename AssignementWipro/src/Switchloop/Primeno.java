package Switchloop;

public class Primeno {

	public static void main(String[] args) {
		int n=7,i=2,f=0;
		while(i<n){
		    if(n%i==0){ f=1; break; }
		    i++;
		}
		System.out.println(f==0?"IT IS Prime":"Not");
	}

}
