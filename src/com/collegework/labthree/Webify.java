package src.com.collegework.labthree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Webify {

    private static final Scanner INPUT = new Scanner(System.in);

    private static boolean isFirstLineOfList = true;
    private static boolean isLastLineOfList = false;

    public static void main(String[] args)
            throws FileNotFoundException {
        System.out.println("Please input file name");
        String nameOfFile = INPUT.nextLine();
        String removeFileSuffixAkaTxt = nameOfFile.substring(0, nameOfFile.length() - 4);

        System.out.println(removeFileSuffixAkaTxt + ".html");
        Scanner userInput = new Scanner(new File(nameOfFile));
        PrintStream userOut = new PrintStream(new File(removeFileSuffixAkaTxt));
        System.out.println("<html>");
        System.out.println("<body>");

        while (userInput.hasNextLine()) {
            String newLine = userInput.nextLine();
//            System.out.println(newLine);
            if (isLastLineOfList == true) {
                if (!newLine.startsWith("-")) {
                    System.out.println("</ul>");
                    isLastLineOfList = false;
                    isFirstLineOfList = true;
                }
            }
            if (newLine.length() == 0) {
                System.out.println("<p>");
            } else {
                if (newLine.startsWith("_")) {
                    String newString = newLine.substring(1, newLine.length() - 1);
                    System.out.println("<h1>" + newString + "</h1>");
                } else if (newLine.startsWith("-")) {
                    isLastLineOfList = true;
                    if (isFirstLineOfList == true) {
                        System.out.println("<ul>");
                        isFirstLineOfList = false;
                    }
                    String newString = newLine.substring(2, newLine.length());
                    System.out.println("<li>" + newString + "</li>");
                } else {
                    System.out.println(newLine + "<br />");
                }
            }
        }

        System.out.println("</body>");
        System.out.println("</html>");
    }
}
