package Assignmentday10;

	import java.io.*;
	import java.util.Scanner;

	public class Appenddata {
	    public static void main(String[] args) throws Exception {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Data: ");
	        String data = sc.nextLine();

	        BufferedWriter bw =
	        new BufferedWriter(new FileWriter("D:\\Java Selenium\\adv_Assignmentwipro\\test.txt\\", true));

	        bw.write(data);
	        bw.newLine();

	        bw.close();

	        System.out.println("Data Added");
	    }
	}

