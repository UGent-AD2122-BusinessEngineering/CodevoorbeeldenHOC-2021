import java.util.Scanner;

public class TxtFileIODemo {


    public void txtFileOutput(String bestandsnaam){
        //aanmaken PrintWriterObject


        //lijnen tekst vragen en onmiddelijk inlezen
        System.out.println("Geef drie lijnen tekst:");
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i< 3; i++){
            String line = keyboard.nextLine();

        }

        //sluiten stream

        System.out.println("De lijnen tekst werden weggeschreven naar " + bestandsnaam);

    }

    public void txtFileInput(String bestandsnaam){
        //Scanner object aanmaken voor txt input

        //alle lijnen van txt bestand inlezen en printen

        //Scanner object sluiten
    }

    public static void main(String[] args) {

    }


}
