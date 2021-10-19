/**
 *
 * @author fgailly
 */
public class RecursiveCountDown {

    // recursieve methode voor countdown

    public void countdown(int getal){
        if(getal == 0)
            System.out.println("Start");
        else
        {
            System.out.println(getal);
            countdown(getal - 1);
        }
    }

    public static void main(String[] args) {
        RecursiveCountDown test = new RecursiveCountDown();
        test.countdown(20);
    }

    //main om te testen



}