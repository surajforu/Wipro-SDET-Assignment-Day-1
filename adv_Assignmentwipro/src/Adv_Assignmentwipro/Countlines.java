package Adv_Assignmentwipro;
import java.io.*;

public class Countlines {

	
	    public static void main(String[] args) throws Exception {

	        BufferedWriter bw =new BufferedWriter(new FileWriter("test.txt"));

	        bw.write("Hello\n");
	        bw.write("Java\n");
	        bw.write("Python\n");
	        bw.write("c\n");

	        bw.close();

	        
	        BufferedReader br=  new BufferedReader(new FileReader("test.txt"));

	        int count = 0;

	        while(br.readLine() != null) {
	            count++;
	        }

	        System.out.println("Number of lines: " + count);

	        br.close();
	    }
	}

