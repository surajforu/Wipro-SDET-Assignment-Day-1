package Assignmentday10;

	import java.io.*;

	public class Countwords {
	    public static void main(String[] args) throws Exception {

	        BufferedReader br =
	        new BufferedReader(new FileReader("D:\\Java Selenium\\adv_Assignmentwipro\\test.txt\\"));

	        String line;

	        int count = 0;

	        while((line = br.readLine()) != null) {

	            String words[] = line.split(" ");

	            for(String w : words) {

	                if(w.equals("Java"))
	                    count++;
	            }
	        }

	        System.out.println("Java Count: " + count);

	        br.close();
	    }
	}

