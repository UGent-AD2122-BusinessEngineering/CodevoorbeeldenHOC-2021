import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TransactionReader {
    public void readCSVFIle(String bestandsnaam){
        try
        {
            Scanner inputStream = new Scanner(new File(bestandsnaam));
            // Read the header line
            String lijn = inputStream.nextLine();
            // Total sales
            double totaal = 0;
            // Read the rest of the file line by line
            while (inputStream.hasNextLine())
            {
                // Contains SKU,Quantity,Price,Description
                lijn = inputStream.nextLine();
                // Turn the string into an array of strings
                String[] ary = lijn.split(";");
                // Extract each item
                String productID = ary[0];
                int hoeveelheid = Integer.parseInt(ary[1]);
                double prijs = Double.parseDouble(ary[2]);
                String beschrijving = ary[3];
                // Output item
                System.out.printf("%d stuks verkocht van product %s (productID: %s) aan €%1.2f stuk.\n",hoeveelheid, beschrijving, productID, prijs);
                // Compute total
                totaal += hoeveelheid * prijs;
            }
            System.out.printf("Totale omzet: $%1.2f\n",totaal);
            inputStream.close( );
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Cannot find file " + bestandsnaam);
        }
        catch(Exception e)
        {
            System.out.println("Problemen bij lezen bestand " + bestandsnaam);
        }
    }

    public static void main(String[] args) {
        TransactionReader tr = new TransactionReader();
        tr.readCSVFIle("transactions.txt");
    }
}
