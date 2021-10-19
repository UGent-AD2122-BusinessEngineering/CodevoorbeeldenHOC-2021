import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class Gemiddelden {
    private int max = 10000;
    private int grootteLijst = 100;

    public double[] gemiddelden1(int [] list){
        int n = list.length;
        double[] result = new double[n];
        for(int i = 0; i < n; i++){
            double gem = 0;
            for(int j = 0; j < i; j++)
                gem += list[j];
            result[i] = gem/(i+1);
        }
        return result;
    }

    public double[] gemiddelden2(int [] list){
        int n = list.length;
        double[] result = new double[n];
        double gem = 0;
        for(int i = 0; i < n; i++){
            gem += list[i];
            result[i] = gem/(i+1);
        }
        return result;
    }

    public int[] randomList(int n){
        int[] list = new int[n];
        Random rnd = new Random();
        for(int i = 0; i < n; i++)
            list[i] = rnd.nextInt();
        return list;
    }

    public void eficientieGemiddelden1(){
        try {
            PrintWriter out = new PrintWriter("analyse1.csv");
            int[] getallen = randomList(max);
            for(int i = 0; i < max/grootteLijst; i++ ){
                long startTime = System.nanoTime();
                double[] result = gemiddelden1(Arrays.copyOfRange(getallen,0,grootteLijst * (i+1) ));
                long endTime = System.nanoTime();
                long time = endTime - startTime;
                out.println(grootteLijst* (i+1) +";" +time );
            }
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("Could not open file");
        }

    }


    public void eficientieGemiddelden2(){
        try {
            PrintWriter out = new PrintWriter("analyse2.csv");
            int[] getallen = randomList(max);
            for(int i = 0; i < max/grootteLijst; i++ ){
                long startTime = System.nanoTime();
                double[] result = gemiddelden2(Arrays.copyOfRange(getallen,0,grootteLijst * (i+1) ));
                long endTime = System.nanoTime();
                long time = endTime - startTime;
                out.println(grootteLijst* (i+1) +";" +time );
            }
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("Could not open file");
        }

    }

    public static void main(String[] args) {
        Gemiddelden g = new Gemiddelden();
        g.eficientieGemiddelden1();
        //g.eficientieGemiddelden2();
    }
}
