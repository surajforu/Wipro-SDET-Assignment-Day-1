package Adv_Assignmentwipro;

	import java.io.*;

	public class Replaceword {
	    public static void main(String[] args) throws IOException {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        System.out.print("Enter String: ");
	        String s = br.readLine();

	        s = s.replace("python", "java");

	        System.out.println(s);
	    }
	}

