import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            System.out.println("Twee getallen delen");
            Scanner in = new Scanner(System.in);
            int getal1 = in.nextInt();
            int getal2 = in.nextInt();
            int result = delen2(getal1, getal2);
            System.out.println("Resultaat is: " + result);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static int delen(int getal1, int getal2){
        try {
            if(getal1 == 0)
                throw new Exception("Delen door nul lukt niet");
            return getal1 / getal2;
        }
        catch (Exception e) {
                e.getMessage();
            }
        return 0;
    }

    public static int delen2(int getal1, int getal2) throws Exception {
        if(getal1 == 0)
            throw new Exception("Delen door nul lukt niet");
        return getal1 / getal2;

    }

}
