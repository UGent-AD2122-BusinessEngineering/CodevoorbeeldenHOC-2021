import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TxtFileIODemo {


    public void txtFileOutput(String bestandsnaam){
        //aanmaken PrintWriterObject
        PrintWriter printer = null;

        try {
            printer = new PrintWriter(bestandsnaam);
        } catch (FileNotFoundException e) {
            System.out.println("Bestand " + bestandsnaam + " bestaat niet");
        }

        //lijnen tekst vragen en onmiddelijk inlezen
        System.out.println("Geef drie lijnen tekst:");
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i< 3; i++){
            String line = keyboard.nextLine();
            printer.println(line);

        }
        printer.close();

        //sluiten stream

        System.out.println("De lijnen tekst werden weggeschreven naar " + bestandsnaam);

    }

    public void txtFileInput(String bestandsnaam){
        //Scanner object aanmaken voor txt input

        Scanner input = null;
        try {
            input = new Scanner(new File(bestandsnaam));
        } catch (FileNotFoundException e) {
            System.out.println("Bestand niet gevonden");
        }

        //alle lijnen van txt bestand inlezen en printen
        while(input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);
        }

        //Scanner object sluiten
        input.close();
    }

    public static void main(String[] args) {
        TxtFileIODemo test1 = new TxtFileIODemo();
        test1.txtFileOutput("resultaat.txt");

        test1.txtFileInput("resultaat.txt");

    }


}
