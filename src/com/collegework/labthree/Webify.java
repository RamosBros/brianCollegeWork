package src.com.collegework.labthree;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class Webify {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args)
        throws FileNotFoundException {
        System.out.println("Please input file name");
        String nameOfFile = INPUT.nextLine();

        Scanner userInput = new Scanner(new File(nameOfFile));
        System.out.println(userInput + ".html");

        System.out.println("<html>");
        System.out.println("<body>");


        System.out.println("</body>");
        System.out.println("</html>");

    }
    public void makeItAList(String userInput)
        throws FileNotFoundException {
        if(userInput.startsWith("-")) {
            userInput.equals("<li>" + userInput + "<li>");
        }
    }
    public void makeItAHeader(String userInput)
        throws FileNotFoundException {
        if(userInput.startsWith("_")) {
            userInput.equals("<h1>" + userInput + "<h1>");
        }
    }
    public void makeItAParagraph(String userInput)
        throws FileNotFoundException {
        if(userInput.){

        }
    }
}
