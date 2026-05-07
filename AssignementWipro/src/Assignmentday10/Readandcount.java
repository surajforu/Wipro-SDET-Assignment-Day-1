package Assignmentday10;
import java.io.*;

public class Readandcount {
    public static void main(String[] args) throws Exception {

        BufferedReader br =  new BufferedReader(new FileReader("D:\\Java Selenium\\adv_Assignmentwipro\\test.txt\\"));

        int lines = 0, words = 0, chars = 0;

        String line;

        while((line = br.readLine()) != null) {

            lines++;

            words += line.split(" ").length;

            chars += line.length();
        }

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);

        br.close();
    }
}


