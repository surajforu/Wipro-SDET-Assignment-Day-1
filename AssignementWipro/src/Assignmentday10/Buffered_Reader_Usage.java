package Assignmentday10;

	import java.io.*;

	public class Buffered_Reader_Usage {
	    public static void main(String[] args) throws Exception {

	        BufferedReader br =
	        new BufferedReader(new FileReader("D:\\Java Selenium\\adv_Assignmentwipro\\test.txt\\"));

	        String line;

	        while((line = br.readLine()) != null) {

	            if(line.contains("Java"))
	                System.out.println(line);
	        }

	        br.close();
	    }
	}

