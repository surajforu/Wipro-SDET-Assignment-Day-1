package Switchloop;

public class Grade {

	public static void main(String[] args) {
		char g = 'A';
		switch(g){
		    case 'A': System.out.println("Excellent"); break;
		    case 'B': System.out.println("Good"); break;
		    case 'C': System.out.println("Average"); break;
		    case 'D': System.out.println("Pass"); break;
		    default: System.out.println("Fail");
		}

}}
