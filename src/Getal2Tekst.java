public class Getal2Tekst {

    public void getal2TekstRec(int getal){
        if(getal < 10){
            System.out.print(cijfer2Tekst(getal));
        }
        else{
            getal2TekstRec(getal/10);
            System.out.print(" " + cijfer2Tekst(getal%10));

        }

    }

    public void getal2TekstIter(int getal){

        int deler = bepaalDeler(getal);
        int hulpgetal = getal;

        while(hulpgetal > 9){
            System.out.println(cijfer2Tekst(hulpgetal / deler));
            hulpgetal = hulpgetal % deler;
            //deler = bepaalDeler(hulpgetal);
            deler = deler / 10;
        }
        System.out.println(cijfer2Tekst(hulpgetal));


    }

    public int bepaalDeler(int getal){
        int deler = 1;
        while(getal > 10){
            deler = deler * 10;
            getal = getal / 10;
        }

        return deler;
    }

    private String cijfer2Tekst(int cijfer){
        switch (cijfer) {
            case 0:
                return "nul";
            case 1:
                return "één";
            case 2:
                return "twee";
            case 3:
                return "drie";
            case 4:
                return "vier";
            case 5:
                return "vijf";
            case 6:
                return "zes";
            case 7:
                return "zeven";
            case 8:
                return "acht";
            case 9:
                return "negen";
        }
        return "ongeldig";
    }

    public static void main(String[] args) {
        Getal2Tekst test = new Getal2Tekst();
        int getal = 56789;
        test.getal2TekstRec(getal);
        System.out.println();
        test.getal2TekstIter(getal);



    }
}
