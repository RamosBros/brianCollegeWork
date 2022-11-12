package src.com.collegework.labreportgenerator;
import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class labreportgenerator {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args)
            throws FileNotFoundException {
        System.out.println("Please input the name of your file(include the .etc");

            String nameOfFile = INPUT.nextLine();
            String removeFileSuffixAkaTxt = nameOfFile.substring(0, nameOfFile.length() - 4);

            System.out.println(removeFileSuffixAkaTxt + ".docx");
            Scanner userInput = new Scanner(new File(nameOfFile));
            PrintStream userOut = new PrintStream(new File(removeFileSuffixAkaTxt));

//            public static void CreateFile(){
//                try{
//                    File outPutFile = new File(removeFileSuffixAkaTxt + ".docx");
//                    if(outPutFile.createNewFile()){
//                        System.out.println("File Created: " + outPutFile.getName());
//                    } else {
//                        System.out.println("File already exists.");
//                    }
//                    } catch (IOException e){
//                    System.out.println("An error occured.");
//                    e.printStackTrace();
//                    }
//                }
        }

    }

